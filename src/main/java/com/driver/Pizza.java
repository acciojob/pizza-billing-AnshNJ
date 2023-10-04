package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheesePrice;
    private boolean extraCheeseAdded;

    private int extraToppingsPrice;
    private boolean extraToppingsAdded;
    private int takeawayPrice;
    private boolean isTakeaway;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.isTakeaway = false;
        this.isBillGenerated = false;

        this.isVeg = isVeg;
        // your code goes here
        this.extraCheesePrice = 80;
        this.takeawayPrice = 20;
        if(isVeg) {
            this.price = 300;
            extraToppingsPrice = 70;
        } else {
            this.price = 400;
            extraToppingsPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: "+this.price+ '\n';

    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded){
            this.price += extraCheesePrice;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded){
            this.price += extraToppingsPrice;
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            this.price += takeawayPrice;
            isTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated) {
            isBillGenerated = true;
            if (extraCheeseAdded) {
                this.bill = this.bill + "Extra Cheese Added: " + extraCheesePrice + '\n';
            }
            if (extraToppingsAdded) {
                this.bill = this.bill + "Extra Toppings Added: " + extraToppingsPrice + '\n';
            }
            if (isTakeaway) {
                this.bill = this.bill + "Paperbag Added: " + takeawayPrice + '\n';
            }
            this.bill = this.bill + "Total Price: " + this.price + '\n';
        }
        return this.bill;
    }
}
