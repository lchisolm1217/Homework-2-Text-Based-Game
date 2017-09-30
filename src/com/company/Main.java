package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Calendar;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        String input = scanner.nextLine();
        System.out.println("Hey There " + input + "! What month were you born? (MM) ");
        int month = scanner.nextInt();
        System.out.println("On what Day? (dd) ");
        int day = scanner.nextInt();

        String zodiacSign = determineSign(month, day);
        System.out.println("Your zodiac is: " + zodiacSign);

        int counter = 2;

        while (counter > 0) {
            for (int i = 0; i < zodiacSign.length(); i++) {
                System.out.println(zodiacSign.charAt(i));
            }
            counter--;
        }
        System.out.println("das it");
    }


    public static String determineSign(int month, int day) {

        String zodiacSign = "";

        switch (month) {
            case 1:
                if (day <= 19) {
                    zodiacSign = "Capricorn";
                } else {
                    zodiacSign = "Aquarius";
                }
                break;
            case 2:
                if (day <= 18) {
                    zodiacSign = "Aquarius";
                } else {
                    zodiacSign = "Pisces";
                }
                break;
            case 3:
                if (day <= 19) {
                    zodiacSign = "Pisces";
                } else {
                    zodiacSign = "Aries";
                }
                break;
            case 4:
                if (day <= 19) {
                    zodiacSign = "Aries";
                } else {
                    zodiacSign = "Taurus";
                }
                break;
            case 5:
                if (day <= 20) {
                    zodiacSign = "Taurus";
                } else {
                    zodiacSign = "Gemini";
                }
                break;
            case 6:
                if (day <= 20) {
                    zodiacSign = "Gemini";
                } else {
                    zodiacSign = "Cancer";
                }
                break;
            case 7:
                if (day <= 22) {
                    zodiacSign = "Cancer";
                } else {
                    zodiacSign = "Leo";
                }
                break;
            case 8:
                if (day <= 22) {
                    zodiacSign = "Leo";
                } else {
                    zodiacSign = "Virgo";
                }
                break;
            case 9:
                if (day <= 22) {
                    zodiacSign = "Virgo";
                } else {
                    zodiacSign = "Libra";
                }
                break;
            case 10:
                if (day <= 22) {
                    zodiacSign = "Libra";
                } else {
                    zodiacSign = "Scorpio";
                }
                break;
            case 11:
                if (day <= 21) {
                    zodiacSign = "Scorpio";
                } else {
                    zodiacSign = "Sagittarius";
                }
                break;
            case 12:
                if (day <= 21) {
                    zodiacSign = "Sagittarius";
                } else {
                    zodiacSign = "Capricorn";
                }
                break;
        }
        return zodiacSign;
    }

}