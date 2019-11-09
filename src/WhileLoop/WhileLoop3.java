package WhileLoop;

import java.util.Scanner;

public class WhileLoop3 {

    // calculate the average score
    // if the average is less than 60
    // print "take the exam again"
    // if more than 60
    // print "You've passed the exam"
    // end the program

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean passExam = true;
        while (passExam) {
            System.out.println("1st score?");
            int test1 = in.nextInt();
            System.out.println("2nd score ");
            int test2 = in.nextInt();
            System.out.println("3d score? ");
            int test3 = in.nextInt();
            int avgScore = (test1 + test2 + test3) / 3;
            if (avgScore < 60) {
                System.out.println("Take the exam again");
            } else {
                System.out.println("You've passed!!!");
                passExam = false;
            }
        }
        String passWord = "ChaseBankPass222";
        String userName = "DevX School";
        System.out.println("Please Enter your user Name");
        String userNameEntered = in.nextLine();
        System.out.println("Please Enter your password");
        String passEntered = in.nextLine();
        if(userName.equalsIgnoreCase(userNameEntered) && passEntered.equals(passWord)){
            System.out.println("You are Successfully Logged in");
        }
        else{
            System.out.println("Invalid Password entered");
        }
    }
}