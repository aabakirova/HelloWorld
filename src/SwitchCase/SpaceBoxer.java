package SwitchCase;

import java.util.Scanner;

public class SpaceBoxer {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
double weight;int planet;
System.out.println("Please enter your current earth weight: ");weight =sc.nextDouble();
System.out.println("I have information for following planets: ");System.out.println("\t1. Venus \t2. Mars \t3.Jupiter");System.out.println("\t 4.Saturn \t5. Uranus\t 6.Neptune");
System.out.println("Which planet are you visiting?");planet=sc.nextInt();

//#   Planet  Relative gravity
//1   Venus   0.78
//2   Mars    0.39
//3   Jupiter 2.65
//4   Saturn  1.17
//5   Uranus  1.05
//6   Neptune 1.23

        if(planet == 1){
            weight= weight * 0.78;
            System.out.println("Your weight would be" + weight+ " pounds on Venus");
        }else if (planet == 2){
            weight = weight * 0.39;
            System.out.println("Your weight would be " + weight+ " pounds on Mars");
        }else if (planet==3){
            weight = weight * 2.65;
            System.out.println("Your weight would be " + weight+ " pounds on Jupiter");
        }else if (planet == 4){
            weight = weight * 1.17;
            System.out.println("Your weight would be " + weight+ " pounds on Saturn");
        }else if (planet==5){
            weight= weight * 1.05;
            System.out.println("Your weight would be " + weight+ " pounds on Uranus");
        }else if (planet==6){
            weight= weight * 1.23;
            System.out.println("Your weight would be " + weight+ " pounds on Neptune");
        }else{
            System.out.println("Wrong number! Please input from 1-6");
        }
    }
}