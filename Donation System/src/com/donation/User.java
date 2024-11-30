package com.donation;

import java.util.ArrayList;

public class User {
    private String userID;
    private String name;
    private double balance;
    private double totalDonation; 
    private ArrayList<String> donationHistory;

    public User(String userID, String name, double balance) {
        this.userID = userID;
        this.name = name;
        this.balance = balance;
        this.totalDonation = 0; 
        this.donationHistory = new ArrayList<>();
    }

    public void donate(double amount, String campaign) {
        if (this.balance >= amount) {
            this.balance -= amount; 
            this.totalDonation += amount;
            donationHistory.add("Donated " + amount + " to " + campaign);
            System.out.println("Donation successful: " + amount + " to " + campaign);
            System.out.println("Remaining Balance: " + this.balance); 
        } else {
            System.out.println("Insufficient balance for donation!");
        }
    }

    public ArrayList<String> getHistory() {
        return donationHistory;
    }

    public double getTotalDonation() {
        return totalDonation;
    }

    public double getBalance() {
        return balance;
    }
}
