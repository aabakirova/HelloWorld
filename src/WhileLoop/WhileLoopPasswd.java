package WhileLoop;

import java.util.Scanner;

public class WhileLoopPasswd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String passWord = "ChaseBankPass222";
        String userName = "DevX School";
        boolean retry = true;
        int retryCount =0;
        while (retry && retryCount < 3) {
            System.out.println("Please Enter your user Name");
            String userNameEntered = in.nextLine();
            System.out.println("Please Enter your password");
            String passEntered = in.nextLine();
            if (userName.equalsIgnoreCase(userNameEntered) && passEntered.equals(passWord)) {
                System.out.println("You are Successfully Logged in");
                retry = false;
            } else {
                System.out.println("Invalid Password entered");
                retryCount++;
            }

        }
    }
}