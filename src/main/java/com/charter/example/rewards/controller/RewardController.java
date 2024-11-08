package com.charter.example.rewards.controller;

import com.charter.example.rewards.model.Reward;
import com.charter.example.rewards.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rewards")
public class RewardController {

    @Autowired
    private RewardService rewardService;

    @GetMapping("/{customerId}")
    public List<Reward> getRewards(@PathVariable Long customerId) {
        return rewardService.calculateRewards(customerId);
    }
}