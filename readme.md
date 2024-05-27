# Java I: Body Mass Index (BMI)


## UPDATE APP (27/15/2024)
I added a simple interface using JOptionPane's methods "showInputDialog" and "showMessageDialog". 


        String weight = JOptionPane.showInputDialog 
        ("Introduce tu peso (ej: 58.2): ");
        String height = JOptionPane.showInputDialog
        ("Introduce tu altura (ej: 1.58): ");
        JOptionPane.showMessageDialog(null, "Tu índice de masa corporal es: " + bmi + ". "+ classification)

## Project Context

In the context of promoting health and well-being, our development team has set out to create a Body Mass Index (BMI) Calculator in Java. This application will provide users with an easy-to-use tool to calculate their BMI and better understand their physical health.

## Steps to Develop the BMI Calculator

1. **Import the Scanner Class**  
   To enable user input, it is necessary to import the `Scanner` class.

2. **Instantiate the Scanner Class**  
   Create an object of the `Scanner` class to read user inputs.

3. **Create Variables of Type `float`**  
   Use user inputs to create `float` variables that will store the values needed for the BMI calculation.

4. **Close the Scanner**  
   After obtaining all necessary inputs, close the `Scanner` object.

5. **Calculate the BMI**  
   Create a variable that will perform the BMI calculation using the appropriate formula.

6. **Round the BMI**  
   Round the calculated BMI value to one decimal place for easier interpretation.

7. **Compare the BMI with Standard Ranges**  
   Compare the BMI value with the standard BMI table to determine the user's weight category and provide a description of the obtained BMI range.


# Java I: Índice de Masa Corporal
## ACTUALIZACIÓN APP (27/15/2024)
He añadido una interfaz simple usando los métodos "showInputDialog" y "showMessageDialog" de JOptionPane. 


        String weight = JOptionPane.showInputDialog 
        ("Introduce tu peso (ej: 58.2): ");
        String height = JOptionPane.showInputDialog
        ("Introduce tu altura (ej: 1.58): ");
        JOptionPane.showMessageDialog(null, "Tu índice de masa corporal es: " + bmi + ". "+ classification)

## Contexto del Proyecto

En el contexto de promover la salud y el bienestar, nuestro equipo de desarrollo se ha propuesto crear una Calculadora de Índice de Masa Corporal (IMC) en Java. Esta aplicación proporcionará a los usuarios una herramienta fácil de usar para calcular su IMC y comprender mejor su salud física.

## Pasos para Desarrollar la Calculadora de IMC

1. **Importar la clase Scanner**  
   Para poder introducir inputs de usuario, es necesario importar la clase `Scanner`.

2. **Instanciar la Clase Scanner**  
   Crear un objeto de la clase `Scanner` para leer los inputs del usuario.

3. **Crear Variables del Tipo `float`**  
   Utilizar los inputs del usuario para crear variables de tipo `float` que almacenarán los valores necesarios para el cálculo del IMC.

4. **Cerrar el Scanner**  
   Después de obtener todos los inputs necesarios, cerrar el objeto `Scanner`.

5. **Calcular el IMC**  
   Crear una variable que realizará el cálculo del IMC utilizando la fórmula correspondiente (peso/(altura*altura)).

6. **Redondear el IMC**  
   Redondear el valor calculado del IMC a un decimal para facilitar su interpretación.

7. **Comparar el IMC con los Rangos Establecidos**  
   Comparar el valor del IMC a través de IF STATEMENTS con los datos proporcionados por la tabla estándar de IMC para determinar la categoría de peso del usuario y proporcionar una descripción del rango obtenido.

