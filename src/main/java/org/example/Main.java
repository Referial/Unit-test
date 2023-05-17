package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Проиграмма выбора лучшей системы налогообложения.");
        int income = 0; // Доходы
        int expenses = 0; // Расходы
        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход.");
            System.out.println("2. Добавить новый расход.");
            System.out.println("3. Выбрать систему налогообложения.");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Прграмма завершина.");
                break;
            }
            int option = Integer.parseInt(input);
            switch (option) {
                case 1:
                    System.out.println("Введите новый доход:");
                    String moneyInc = scanner.nextLine();
                    int money = Integer.parseInt(moneyInc);
                    income += money;
                    System.out.println(income);
                    break;
                case 2:
                    System.out.println("Введите новый расход:");
                    String moneyExp = scanner.nextLine();

                    int money1 = Integer.parseInt(moneyExp);
                    expenses += money1;
                    break;
                case 3:
                    System.out.println("Выбирете систему налогооблажения:");
                    int exp1 = Taxation.expenses1(income); // Налог от доходов
                    int exp2 = Taxation.expenses2(income, expenses); // Налог от доходы минус расходы
                    int best = Taxation.tax(exp1, exp2);

                    switch (best) {
                        case 1:
                            System.out.println("Мы советуем вам УСН доходы.");
                            break;
                        case 2:
                            System.out.println("Мы советуем вам УСН доходы минус расходы.");
                            break;
                        default:
                            continue;
                    }
                    System.out.println("Налог через УСН доходы: " + exp1);
                    System.out.println("Налог через УСН доходы минус расходы: " + exp2);
                    int economy = Taxation.eco(exp1, exp2);
                    System.out.println("Экономия этим способом сотсавляет: " + economy);
                    break;
                default:
                    System.out.println("Такой операции несуществует.");
                    break;
            }

        }
    }
}