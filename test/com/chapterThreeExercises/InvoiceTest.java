package com.chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice myInvoice;

    @BeforeEach
    void setUp() {
        myInvoice = new Invoice("1056","green", 5,2500.00 );

    }
        @Test
      void testThatInvoiceCanSetPartNumber() {
            myInvoice.setPartNumber("1056");
            assertEquals("1056", myInvoice.getPartNumber());

        }
        @Test
    void testThatInvoiceCanSetPartDescription(){
        myInvoice.setPartDescription("green");
        assertEquals("green", myInvoice.getPartDescription());
        }

        @Test
    void testThatInvoiceCanSetQuantityOfItemPurchased(){
        myInvoice.setQuantityOfItemPurchased(5);
        assertEquals(5, myInvoice.getQuantityOfItemPurchased());
}
        @Test
    void testThatInvoiceCanSetPricePerItem(){
        myInvoice.setPricePerItem(2500.00);
    assertEquals(2500.00, myInvoice.getPricePerItem());
}
       @Test
    void testThatAmountCanBeCalculated(){
           myInvoice.setQuantityOfItemPurchased(5);
           myInvoice.setPricePerItem(2500.00);
        assertEquals(12500.00, myInvoice.getInvoiceAmount());
       }
}