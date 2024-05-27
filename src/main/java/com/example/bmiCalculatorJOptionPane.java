package com.example;

import javax.swing.JOptionPane;

public class bmiCalculatorJOptionPane {
    public static void main(String[] args) {
        String weight = JOptionPane.showInputDialog 
        ("Enter your weight (eg: 58.2): ");
        String height = JOptionPane.showInputDialog
        ("Enter your height (eg: 1.58): ");
        
        
        double weightToDouble = Double.parseDouble(weight);
        double heightToDouble = Double.parseDouble(height);
       
        System.out.println(weight + height);
        double bmiFloat = weightToDouble/(heightToDouble*heightToDouble);
                
        double bmi = Math.round(bmiFloat * 10d) / 10d;
               
        String classification = "";
        if(bmi < 16.0) {
            classification = "You have severe thinness.";
        } else if(bmi >= 16.0 && bmi < 17.0) {
            classification = "You have moderate thinness.";
        } else if(bmi >= 17.0 && bmi < 18.5) {
            classification = "You have mild thinness.";
        } else if(bmi >= 18.5 && bmi < 25.0) {
            classification = "You have normal weight.";
        } else if(bmi >= 25.0 && bmi < 30.0) {
            classification = "You are overweight.";
        } else if(bmi >= 30.0 && bmi < 35.0) {
            classification = "You have obesity class I.";
        } else if(bmi >= 35.0 && bmi < 40.0) {
            classification = "You have obesity class II (severe obesity).";
        }if(bmi >= 40.0) {
            classification = "You have obesity class III (very severe obesity).";
        }
        JOptionPane.showMessageDialog(null, "Your body mass index is: " + bmi + ". "+ classification);
    }
    
}
