package GroupProject;

import java.util.Scanner;

public class GenderGame {
    /*
    Make a program which displays an appropriate name for a person, using a combination
    of nested ifs and compound conditions. Ask the user for a gender, first name, last
    name and age. If the person is female and 20 or over, ask if she is married. If so,
    display “Mrs.” in front of her name. If not, display “Ms.” in front of her name. <<<<If
    the female is under 20 >>>>, display her first and last name. If the person is male and
    20 or over, display “Mr.” in front of his name.<<<< Otherwise, display his first and
    last name>>>>. Note that asking a person if they are married should only be done if they
    are female and 20 or older, which means you will have a single if and else
    nested inside one of your if statements. Notice that in the example below, we never
    even ask the marriage question, because he/she is under 20 and so his/her marital status
    doesn’t change what we call him/her.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" What is your first name ? ");
        String fName = sc.nextLine();
        System.out.println(" What is your last name ? ");
        String lName = sc.nextLine();
        System.out.println(" Whats your gender ? ");
        char gender = sc.next().charAt(0);
        System.out.println(" How old are you ?");
        int age = sc.nextInt();
        if (gender == 'F') {
            if (age >= 20) {
                System.out.println(" Are you married ? ");
                char status = sc.next().charAt(0);
                if (status == 'y') {
                    System.out.println(" Then I shall call you Mrs. " + lName);
                } else
                    System.out.println(" then I shall call Ms." + lName);
            }
            if (age < 20) {
                System.out.println(" Then I shall call you " + fName +" "+lName);
            }
            // if (gender =='M' && age>= 20){
            System.out.println("I shall cal you Mr. " + lName);
            //  }else { System.out.println(" I shall call you " + firstLastN);
        }

    }
}