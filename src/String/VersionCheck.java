package String;

import java.util.Scanner;

public class VersionCheck {

    /*
    Create a method that can take two params. First String for the any Text.
    Second a String that we will look for in the text(first param).
    The method should be named as versionCheck.
    It should return true if the version we are passing(second param)
    is present in the text(first param)
    We should not check the text(first param) if it’s null or empty.
    Also, if the version in the text(first param) is different than the
    version in the second param go and print out what version is given
    in the first param. And return false.
    Sample text:
    “2019-11-11 - INFO successfully started DevX Adapter App with version: 1.0.4.”
     ——- first param. The format of the String will always be the same.
     Meaning only date and the actual version numbers can change. Everything else will stay the same.
    If second param is “1.0.4” —- method should return true
    If second param is “1.0.5” —- method should print out the current version of the app is 1.0.4 not 1.0.5.
    And return false. Note: 1.0.4 and 1.0.5 are dynamic here. (edited)
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first String here: ");
        String str1 = input.nextLine();
        System.out.println("Enter second String here: ");
        String str2 = input.nextLine();
        boolean callMethod = versionCheck(str1, str2);
        System.out.println(callMethod);
    }

    private static boolean versionCheck(String str1, String str2) {
        if (str1 != null && !str1.isEmpty()) {
            if (str1.contains(str2)) {
                System.out.println("the version of the app is "+str2);
                return true;
            } else
                System.out.println("the current is " +str1.substring(str1.indexOf(":")) + " not " + str2);
            return false;
        } else
            System.out.println("the version is null or empty");
        return false;
    }
}