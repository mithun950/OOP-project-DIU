package com.donation;

public class Campaign {
    private String campaignID;
    private String title;
    private String description;
    private double targetAmount;

    public Campaign(String campaignID, String title, String description, double targetAmount) {
        this.campaignID = campaignID;
        this.title = title;
        this.description = description;
        this.targetAmount = targetAmount;
    }

    public String getTitle() {
        return title;
    }

    public double getTargetAmount() {
        return targetAmount;
    }
}
