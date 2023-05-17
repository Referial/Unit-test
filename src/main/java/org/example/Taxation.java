package org.example;
public class Taxation {
    public static int expenses1 (int income) {
        int tax = income * 6 / 100;
        return tax;
    }

    public static int expenses2 (int income, int expenses) {
        int tax = (income - expenses) *15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static int tax(int exp1, int exp2) {
        if (exp1 <= exp2){
            return 1;
        } else {
            return 2;
        }
    }

    public static int eco(int exp1, int exp2) {
        int x = exp1 - exp2;
        int y = exp2 - exp1;
        if (x >= 0){
            return x;
        } else {
            return y;
        }
    }
}




