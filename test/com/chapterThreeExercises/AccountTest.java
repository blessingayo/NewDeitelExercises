package com.chapterThreeExercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account myAccount;

    @BeforeEach
    void setUp() {
         myAccount = new Account();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void testThatAccountCanBeSet(){
        myAccount.setAccount("name");
        assertEquals("name", myAccount.getAccount());
    }
    @Test
    void testThatAccountCanSetBalance(){
        myAccount.setBalance(5000.00);
        assertEquals(5000.00, myAccount.getBalance());
    }
    @Test
    void testThatAccountCanDeposit(){
        myAccount.setBalance(5000.00);
        myAccount.setDeposit(3000.00);
        assertEquals(8000.00, myAccount.getDeposit());
    }
    @Test
    void testThatAccountCanWithdraw(){
        myAccount.setBalance(8000.00);
        myAccount.setWithdraw(2500.00);
        assertEquals(5500.00, myAccount.getWithdraw());
    }
}