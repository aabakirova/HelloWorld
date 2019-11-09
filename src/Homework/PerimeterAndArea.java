package Homework;

import java.util.Scanner;
public class PerimeterAndArea {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.println("Enter width: ");
        float width=p.nextFloat();

        System.out.println("Enter height: ");
        float height=p.nextFloat();

        float area=width*height;
        float perimeter=2*(width+height);

        System.out.println("Area is "+width +" * "+height+" = " +area);
        System.out.println("Perimeter is "+"2 "+"* "+"("+width +" + "+height+")"+" = " +perimeter);
    }
}
