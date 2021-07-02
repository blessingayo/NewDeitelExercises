package com.chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee  myEmployee;

    @BeforeEach
    void setUp() {
        myEmployee = new Employee("Blessing", "Asuelimen", 500_000.00);

    }
        @Test
        void testThatAppCanSetEmployeeFirstName(){
        myEmployee.setFirstName("firstName");
            assertEquals("firstName", myEmployee.getFirstName());
    }
    @Test
    void testThatAppCanSetLastName(){
        myEmployee.setLastName("lastName");
        assertEquals("lastName", myEmployee.getLastName());
    }
    @Test
    void testThatAppCanSetMonthlySalary(){
        myEmployee.setMonthlySalary(500_000.00);
        assertEquals(500_000.00, myEmployee.getMonthlySalary());
    }

        }

