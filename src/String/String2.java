package String;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        String str1 = "Dev X School";
        System.out.println(str1.equals("DevX School"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you left Handed or Right Handed?");
        String str = sc.nextLine();
        if (str.equals("left")) {
            System.out.println("Sit on right corner of the table");
        } else if (str.equals("right")) {
            System.out.println("Sit on the left corner of the table");
        } else {
            System.out.println("Invalid input. Enter left or right");
        }
        String passWord = "ChaseBankPass222";
        String userName = "DevX School";
        System.out.println("Please Enter your user Name");
        String userNameEntered = sc.nextLine();
        System.out.println("Please Enter your password");
        String passEntered = sc.nextLine();
        if (userName.equalsIgnoreCase(userNameEntered) && passEntered.equals(passWord)) {
            System.out.println("You are Successfully Logged in");
        } else {
            System.out.println("Invalid Password entered");
        }
        System.out.println("Where are you from?");
        String origin = sc.nextLine();
        System.out.println(origin.toLowerCase());
        if (origin.toLowerCase().contains("stan")) {
            System.out.println("Central Asian Folk");
        }
        if (origin.toUpperCase().contains("STAN")) {
            System.out.println("Central Asian Folk UpperCase".toUpperCase() + " " + origin);
        }
        String strToTrim = "    {John Doe }    ";
        System.out.println(strToTrim);
        System.out.println(strToTrim.length());
        System.out.println(strToTrim.indexOf("{"));
        System.out.println(strToTrim.trim());
        System.out.println(strToTrim.trim().length());
        System.out.println(strToTrim.trim().indexOf("{"));
        String lone = "Lone";
        String bone = lone.replace('L', 'B');
        System.out.println(bone);
        String chrome = lone.replace("Lon", "Chrom");
        System.out.println(chrome);
        System.out.println("Please Enter you Name...");
        String name = sc.nextLine();
        name = name.trim();
        name = name.toLowerCase();
        String leaveOnlyFirstLetter = name.substring(0, 1);
        System.out.println("First Letter of my name: " + leaveOnlyFirstLetter);
        String covertToUpperCase = leaveOnlyFirstLetter.toUpperCase();
        System.out.println("First Letter after upper case: " + covertToUpperCase);
        char firstLetterUpperCased = covertToUpperCase.charAt(0);
        name = name.replace(name.charAt(0), firstLetterUpperCased);
        System.out.println(name);
        // "john";
        String animal = "animal";
        System.out.println(animal.replace('a', ' '));
        animal.charAt(0);
        int indexOfO = "Dev School".indexOf("o");
        System.out.println("Dev School".charAt(indexOfO));
        System.out.println("DevX School".substring("DevX School".indexOf("S")));
        String str4 = "American Dream Dream De Big";
        System.out.println(str4.substring(15));

        System.out.println("Please Enter you Last Name and First Name inside {}");
        String name2 = sc.nextLine();
        name = name2.trim();
        System.out.println(name2);
        int openingCurly = name2.indexOf("{");
        System.out.println("opening " + openingCurly);
        String nameWithoutOpenCurly = name2.substring(openingCurly+1);
        int closingCurly = nameWithoutOpenCurly.indexOf("}");
        System.out.println("index of closing" + closingCurly);
        String nameWithoutClosingCurly = nameWithoutOpenCurly.substring(openingCurly+1, closingCurly);
        System.out.println(nameWithoutClosingCurly);
    }
}

