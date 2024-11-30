package com.donation;

public class Main {
    public static void main(String[] args) {
       
        User user = new User("U001MI", "Mithun", 15000); 
        Campaign campaign = new Campaign("C001", "Save the Children", "Help children in need", 11000);
        Histoy historyPage = new Histoy();

       
        user.donate(890, campaign.getTitle());
        user.donate(2380, campaign.getTitle());

       
        historyPage.displayHistory(user);
    }
}
