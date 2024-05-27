package com.example;
import java.util.Scanner;


public class bmicalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight (eg: 58,2): ");
        float weight =scanner.nextFloat();
        System.out.println("You have entered correctly your weight: " + weight);

        System.out.println("Ener your height (eg: 1,58): ");
        float height = scanner.nextFloat();
        System.out.println("You have entered correctly your height: " + height);
        scanner.close();

        double bmiFloat = weight/(height*height);
                
        double bmi = Math.round(bmiFloat * 10d) / 10d;
               
      
        if(bmi < 16.0) {
            System.out.println("Your body mass index is " + bmi + ". You have severe thinness.");
        } else if(bmi >= 16.0 && bmi < 17.0) {
            System.out.println("Your body mass index is " + bmi + ". You have moderate thinness.");
        } else if(bmi >= 17.0 && bmi < 18.5) {
            System.out.println("Your body mass index is " + bmi + ". You have mild thinness.");
        } else if(bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Your body mass index is " + bmi + ". You have normal weight.");
        } else if(bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Your body mass index is " + bmi + ". You are overweight.");
        } else if(bmi >= 30.0 && bmi < 35.0) {
            System.out.println("Your body mass index is " + bmi + ". You have obesity class I.");
        } else if(bmi >= 35.0 && bmi < 40.0) {
            System.out.println("Your body mass index is " + bmi + ". You have obesity class II (severe obesity).");
        }if(bmi >= 40.0) {
            System.out.println("Your body mass index is " + bmi + ". You have obesity class III (very severe obesity).");
        }
}}

            
        
    



