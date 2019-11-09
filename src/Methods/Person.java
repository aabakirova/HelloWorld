package Methods;

import java.util.Scanner;

public class Person {
    //create the program that will ask user to enter month of birth and year of birth
    //then create the separate method to count age (Hint: takes year of birth as a parameter, and return int age)
    //then create the separate method to check the season when he was born(Hint: takes month of birth as a parameter,
    // and return String Season)
    //then in main method create the logic that will check if user is teenager or adult or kid and print
    //this person is (teenager/kid/adult) and age is (how old he is) he was born in (Summer/Winter/Spring/Fall)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year of birth: ");
        int year = input.nextInt();
        System.out.println("Please enter month of birth: ");
        int month = input.nextInt();
        int yourAge = ageMethod(year);
        System.out.println("you are " + yourAge);
        String season = seasonMethod(month);
        System.out.println("you were born in " + season + " season");
        if (yourAge>0 && yourAge <13){
            System.out.println("you are a kid ");
        }else if(yourAge < 20){
            System.out.println("you are a teenager");
        }else System.out.println("you are adult");
    }

    public static int ageMethod(int yearOfBirth) {
        int age = 2019 - yearOfBirth;
        if (age<0){
            System.out.println("invalid year");
            return -1  ;
        }
        return age;
    }

    public static String seasonMethod(int monthOfBirth) {
        String season = "";
        // Spring 3,4,5
        if (monthOfBirth >= 3 && monthOfBirth <= 5) {
            season = "Spring";
            return season;
        } else if (monthOfBirth >= 6 && monthOfBirth <= 8) {
            season = "Summer";
            return season;
        } else if (monthOfBirth >= 9 && monthOfBirth <= 11) {
            season = "Fall";
            return season;
            // '|' one pipe checks both sides of the logical operator; '||' double pipe only until the first true
        } //else if (monthOfBirth == 12 | monthOfBirth == 1 || monthOfBirth ==2 ) {
        else season = "Winter";
        return season;
    }
}

