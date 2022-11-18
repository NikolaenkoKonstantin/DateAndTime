package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date in the form: dd.MM.yyyy.");
        String date = scanner.nextLine();
        String[] spritDate = date.split("\\.");
        LocalDate localDate = LocalDate.of(Integer.parseInt(spritDate[2]),
                Integer.parseInt(spritDate[1]), Integer.parseInt(spritDate[0]));

        isLeapYear(localDate.getYear());
    }

    public static void isLeapYear(int year)
    {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}