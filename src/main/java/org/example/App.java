/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;


class area{

    public static void main(String args[])
    {
        System.out.print("What is the length of the room in feet? ");
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        int lenght = Integer.parseInt(num1);

        System.out.print("What is the width of the room in feet? ");
        String num2 = sc.nextLine();
        int width = Integer.parseInt(num2);

        int area_feet = lenght * width;
        double area_meter = area_feet * 0.09290304;

        System.out.print("The area is\n" + area_feet + " square feet\n"+String.format("%.3f square meters",area_meter));

    }
}