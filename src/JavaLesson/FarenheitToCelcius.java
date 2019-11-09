package JavaLesson;

import java.util.Scanner;

public class FarenheitToCelcius {

    public static void main(String[] args) {
        //  (32°F − 32) × 5/9 = 0°C
        Scanner cs = new Scanner(System.in);
        System.out.println("Please enter your F degree");
        float F = cs.nextFloat();float C = (F - 32) * 5 / 9;System.out.println("Result in C " + C);

        // 1 gl * 3.785
        System.out.println("Please enter amount in gl");
        float gl = cs.nextFloat();float l = gl * 3.785f;
        System.out.println("Result in l " + l);
    }
}