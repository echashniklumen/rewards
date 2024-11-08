package com.charter.example.rewards.service;

import com.charter.example.rewards.model.Reward;
import com.charter.example.rewards.model.Transaction;
import com.charter.example.rewards.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RewardService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Reward> calculateRewards(Long customerId) {
        List<Transaction> transactions = transactionRepository.findByCustomerId(customerId);

        Map<Month, List<Transaction>> transactionsByMonth = transactions.stream()
                .collect(Collectors.groupingBy(t -> t.getDate().getMonth()));

        return transactionsByMonth.entrySet().stream()
                .map(entry -> {
                    Month month = entry.getKey();
                    int points = entry.getValue().stream()
                            .mapToInt(this::calculatePoints)
                            .sum();
                    Reward reward = new Reward();
                    reward.setCustomerId(customerId);
                    reward.setMonth(month);
                    reward.setPoints(points);
                    return reward;
                })
                .collect(Collectors.toList());
    }

    private int calculatePoints(Transaction transaction) {
        double amount = transaction.getAmount();
        int points = 0;
        if (amount > 100) {
            points += (amount - 100) * 2;
            amount = 100;
        }
        if (amount > 50) {
            points += (amount - 50) * 1;
        }
        return points;
    }
}