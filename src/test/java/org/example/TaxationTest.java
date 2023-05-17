package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TaxationTest {

    Taxation taxation;

    @org.junit.jupiter.api.Test
    void expenses1() {
        taxation = new Taxation();

        int income = 600;

        int expect = 36;

         double result = taxation.expenses1(income);

        Assertions.assertEquals(expect, result);
    }

    @org.junit.jupiter.api.Test
    void expenses2() {
        taxation = new Taxation();

        int income = 600;
        int expenses = 1000;

        int expect = 0;

        double result = taxation.expenses2(income, expenses);

        Assertions.assertEquals(expect, result);
    }

    @org.junit.jupiter.api.Test
    void tax() {
        taxation = new Taxation();

        int exp1 = 600;
        int exp2 = 1000;

        int expect = 1;

        double result = taxation.tax(exp1, exp2);

        Assertions.assertEquals(expect, result);
    }

    @org.junit.jupiter.api.Test
    void eco() {
        taxation = new Taxation();

        int exp1 = 200;
        int exp2 = 100;

        int expect = exp1 - exp2;

        double result = taxation.eco(exp1, exp2);

        Assertions.assertEquals(expect, result);
    }
}