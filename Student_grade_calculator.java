/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.internship_project;

/**
 *
 * @author mir atir hussain
 */
import java.util.Scanner;

public class Student_grade_calculator {

    public static void main(String[] args) {
        System.out.println(" How many subject");
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();
        int sum = 0;
        int avg = 0;
        int total = 0;
        for (int i = 1; i <= sub; i++) {
            System.out.println("Enter " + i + " subject marks  between 0 to 100");

            int a = sc.nextInt();
            sum = sum + a;
            avg = sum / i;
            total = i * 100;
        }

        System.out.println("Total marks is  " + total + " by " + sum + " Avgerage percentage " + avg);

        if (avg >= 90) {
            System.out.println("grade A");
        } else if (avg >= 80) {
            System.out.println("Grade B");
        } else if (avg >= 70) {
            System.out.println("Grade c");
        } else {
            System.out.println("Grade D");
        }

    }
}
