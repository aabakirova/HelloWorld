package Methods;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String a = "java";
        boolean containsBoolean = a.contains("jva");
        System.out.println(containsBoolean);

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your last name");

        String lastName = in.nextLine();

        if (lastName.contains("ova")){
            System.out.println("You are a female");
        } else {
            System.out.println("you are not female");
        }
    }
}
