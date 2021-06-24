//3.14 (Date Class) Create a class called Date that includes three instance variables—a month (type
//        int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
//        variables and assumes that the values provided are correct. Provide a set and a get method for each
//        instance variable. Provide a method displayDate that displays the month, day and year separated
//        by forward slashes (/). Write a test app named DateTest that demonstrates class Date’s capabilities.


package com.chapterThreeExercises;

public class Date {
    private int month;
    private int day;
    private int year;
    private final int displayDate;

    public Date(int month, int day, int year, int displayDate){
        this.month = month;
        this.day = day;
        this.year = year;
        this.displayDate = displayDate;
    }


    public void setMonth(int birthMonth) {
        month = birthMonth;

    }

    public int getMonth() {
        return month;
    }

    public void setDay(int birthDay) {
        day = birthDay;
    }

    public int getDate() {
        return day;
    }

    public void setYear(int birthYear) {
        year = birthYear;
    }

    public int getYear() {
        return year;
    }

    public int displayDate() {
        System.out.println("display date " + month + "/" + day + "/" + year);
        return displayDate;
    }
}

