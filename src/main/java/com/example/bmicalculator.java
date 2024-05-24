package com.example;
import java.util.Scanner;


public class bmicalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu peso (ej: 58,2): ");
        float weight =scanner.nextFloat();
        System.out.println("Has introducido correctamente tu peso: " + weight);

        System.out.println("Introduce tu altura (ej: 1,58): ");
        float height = scanner.nextFloat();
        System.out.println("Has introducido correctamente tu altura: " + height);
        scanner.close();

        double bmiFloat = weight/(height*height);
                
        double bmi = Math.round(bmiFloat * 10d) / 10d;
               
      
        if(bmi < 16.0) {
            System.out.println("Tu índice de masa corporal es " + bmi + ". Tienes delgadez severa.");
        } else if(bmi >= 16.0 && bmi < 17.0) {
            System.out.println("Tu índice de masa corporal es " + bmi + ". Tienes delgadez moderada.");
        } else if(bmi >= 17.0 && bmi < 18.5) {
            System.out.println("Tu índice de masa corporal es " + bmi + ". Tienes delgadez leve.");
        } else if(bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Tu índice de masa corporal es " + bmi + ". Tienes peso normal.");
        } else if(bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Tu índice de masa corporal es " + bmi + ". Tienes sobrepeso.");
        } else if(bmi >= 30.0 && bmi < 35.0) {
            System.out.println("Tu índice de masa corporal es " + bmi + ". Tienes obesidad leve.");
        } else if(bmi >= 35.0 && bmi < 40.0) {
            System.out.println("Tu índice de masa corporal es " + bmi + ". Tienes obesidad moderada.");
        }if(bmi >= 40.0) {
            System.out.println("Tu índice de masa corporal es " + bmi + ". Tienes obesidad mórbida.");
        }
}}

            
        
    



