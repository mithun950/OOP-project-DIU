package com.donation;

public class Histoy {
    public void displayHistory(User user) {
        System.out.println("\nDonation History:");
        for (String history : user.getHistory()) {
            System.out.println(history);
        }
        System.out.println("Total Donation Amount: " + user.getTotalDonation());
    }
}
