# Rewards Program Application

This is a Spring Boot application that implements a rewards program for customers. Customers earn points based on their recorded purchases.

Project structure:
src
├── main
│   ├── java
│   │   └── com
│   │       └── charter
│   │           └── example
│   │               └── rewards
│   │                   ├── RewardsApplication.java
│   │                   ├── controller
│   │                   │   └── RewardController.java
│   │                   ├── model
│   │                   │   ├── Customer.java
│   │                   │   ├── Transaction.java
│   │                   │   └── Reward.java
│   │                   ├── repository
│   │                   │   ├── CustomerRepository.java
│   │                   │   └── TransactionRepository.java
│   │                   └── service
│   │                       └── RewardService.java
│   └── resources
│       ├── application.properties
│       └── data.sql
└── test
    └── java
        └── com
            └── charter
                └── example
                    └── rewards
                        └── RewardsApplicationTests.java

## Table of Contents

- [Overview]
- [Features](
- [Technologies]
- [Setup]
- [Running the Application]
- [Testing the Application]
- [API Endpoints]
- [Database Initialization]
- [Testing]
- [License](#license)

## Overview

The application calculates reward points for customers based on their transactions. Customers receive:
- 2 points for every dollar spent over $100 in each transaction.
- 1 point for every dollar spent between $50 and $100 in each transaction.

For example, a $120 purchase earns 90 points (2x$20 + 1x$50).

## Features

- Calculate reward points for each customer per month and total.
- RESTful API to retrieve reward points.
- In-memory H2 database for easy setup and testing.

## Technologies

- Java 21
- Spring Boot 3.1.2
- Spring Data JPA
- H2 Database
- Maven

## Setup

### Prerequisites

- Java 17
- Maven

### Clone the Repository

git clone https://github.com/yourusername/rewards.git
cd rewards