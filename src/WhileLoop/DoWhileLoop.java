package WhileLoop;

// you have 10000 in savings account that earns 5% per year
// how many year it will take to double the amount percentage of the interest
// write a program that calculates the number of years required to double the amount

import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {


        // public static void main(String[] args) {
        //    Scanner in = new Scanner(System.in);
        //    System.out.println("enter contribution amount");
        //    double contribution = in.nextDouble();
        //   System.out.println("Please enter interest rate");
        //   int interest = in.nextInt();
        Scanner in = new Scanner(System.in);
        System.out.println("enter loan amount");

        double loanAmount = in.nextDouble();
        System.out.println("");
        double minimumPaymentRequired = in.nextDouble();
        System.out.println("");
        int noInterestMonth = in.nextInt();
        System.out.println("");
        double lateFeeAmount = in.nextDouble();


    }

   // public static int yearRequired(double contributionAmount, int interestRate) {
     //   return 0;
   // }

    //you are taking 10000(dynamic) loan, minimum payment is 500(dynamic) monthly.
    //late fee(dynamic)
    //if pay this in 10(dynamic) months you don't get charged for interest.
    //after 10 months every month you will have to pay n% of the balance.

    public static void loanProgram(double loanAmount, double minimumPaymentRequired,
                                   int numberOfNoInterestMonth, double lateFeeAmount, int interestRate) {
        double balance = loanAmount;
        int monthNum = 1;
        while (balance >= 0) {
            System.out.println("Your balance amount" + balance);
            System.out.println("Your First Payment" + monthNum + "payment. How much do you want to pay?");
            Scanner in = new Scanner(System.in);
            double payment = in.nextDouble();
            if (payment<=balance){

            }
            balance = balance - payment;
            monthNum++;

        }
        System.out.println("Loan is paid off. Congrats you own the car now!");
    }
}
