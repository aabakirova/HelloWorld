package Homework;

import Homework.ScannerReader;

import java.util.Scanner;

public class FahrenheitToCelsius {
    static public void main(String[] args){
        //T(°C) = (T(°F) - 32) × 5/9
        Scanner temperature = new Scanner(System.in);
        System.out.println("Enter temperature in Farenheit: ");
        double f=temperature.nextDouble();
        double c=(f-32)*5/9;
        System.out.println(f+" degree Fahrenheit is equal to "+c+" in Celsius");
    }
}
