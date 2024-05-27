package com.example;

import javax.swing.JOptionPane;

public class bmiCalculatorJOptionPane {
    public static void main(String[] args) {
        String weight = JOptionPane.showInputDialog 
        ("Introduce tu peso (ej: 58.2): ");
        String height = JOptionPane.showInputDialog
        ("Introduce tu altura (ej: 1.58): ");
        
        
        double weightToDouble = Double.parseDouble(weight);
        double heightToDouble = Double.parseDouble(height);
       
        System.out.println(weight + height);
        double bmiFloat = weightToDouble/(heightToDouble*heightToDouble);
                
        double bmi = Math.round(bmiFloat * 10d) / 10d;
               
        String classification = "";
        if(bmi < 16.0) {
            classification = "Tienes delgadez severa.";
        } else if(bmi >= 16.0 && bmi < 17.0) {
            classification = "Tienes delgadez moderada.";
        } else if(bmi >= 17.0 && bmi < 18.5) {
            classification = "Tienes delgadez leve.";
        } else if(bmi >= 18.5 && bmi < 25.0) {
            classification = "Tienes peso normal.";
        } else if(bmi >= 25.0 && bmi < 30.0) {
            classification = "Tienes sobrepeso.";
        } else if(bmi >= 30.0 && bmi < 35.0) {
            classification = "Tienes obesidad leve.";
        } else if(bmi >= 35.0 && bmi < 40.0) {
            classification = "Tienes obesidad moderada.";
        }if(bmi >= 40.0) {
            classification = "Tienes obesidad mórbida.";
        }
        JOptionPane.showMessageDialog(null, "Tu índice de masa corporal es: " + bmi + ". "+ classification);
    }
    
}
