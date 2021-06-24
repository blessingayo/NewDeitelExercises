package com.chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    Date myDate;

    @BeforeEach
    void setUp() {
        myDate = new Date(8, 30, 2000, 8 / 30 / 2000);
    }
    @Test
    void testThatDateCanSetMonth(){
        myDate.setMonth(8);
        assertEquals(8, myDate.getMonth());
    }
    @Test
    void testThatAppCanSetDay(){
        myDate.setDay(30);
        assertEquals(30, myDate.getDate());
    }
    @Test
    void testThatAppCanSetYear(){
        myDate.setYear(2000);
        assertEquals(2000, myDate.getYear());
    }
    @Test
    void testThatAppCanDisplayDate(){
        myDate.setMonth(8);
        myDate.setDay(30);
        myDate.setYear(2000);
        assertEquals(8 / 30 / 2000, myDate.displayDate());


    }

}