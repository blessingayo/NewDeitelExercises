//3.12 (Invoice Class) Create a class called Invoice that a hardware store might use to represent
//        an invoice for an item sold at the store. An Invoice should include four pieces of information as
//        instance variables—a part number (type String), a part description (type String), a quantity of the
//        item being purchased (type int) and a price per item (double). Your class should have a constructor
//        that initializes the four instance variables. Provide a set and a get method for each instance variable.
//        In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
//        multiplies the quantity by the price per item), then returns the amount as a double value. If the
//        quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
//        0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
//
package com.chapterThreeExercises;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantityOfItemPurchased;
    private double pricePerItem;



    public Invoice(String partNumber, String partDescription, int quantityOfItemPurchased, double pricePerItem) {
            this.partNumber =partNumber;
            this.partDescription = partDescription;
            this.pricePerItem = pricePerItem;
            this.quantityOfItemPurchased = quantityOfItemPurchased;

    }

    public void setPartDescription(String descriptionPart) {
        partDescription = descriptionPart;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantityOfItemPurchased(int quantityOfItemBought) {
        quantityOfItemPurchased = quantityOfItemBought;
    }

    public int getQuantityOfItemPurchased() {
        return quantityOfItemPurchased;
    }


    public void setPricePerItem(double pricePerItems) {
        pricePerItem = pricePerItems;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }


    public double getInvoiceAmount() {
       double amount;
        amount = quantityOfItemPurchased * pricePerItem;
        return amount;
    }


    public void setPartNumber(String partNumberName) {
        partNumber = partNumberName;
    }

    public String getPartNumber() {
        return partNumber;
    }
}

