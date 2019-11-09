package SwitchCase;

import java.util.Scanner;

public class SwitchStatement1 {
    //find a month by getting a sequence number of a month
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNum = sc.nextInt();
        String season;
        String month;
        switch (monthNum) {
            case 1:
                month = "January";
                season = "Winter";
                break;
            case 2:
                month = "February";
                season = "Winter";
                break;
            case 3:
                month = "March";
                season = "Spring";
                break;
            case 4:
                month = "April";
                season = "Spring";
                break;
            case 5:
                month = "May";
                season = "Spring";
                break;
            case 6:
                month = "June";
                season = "Summer";
                break;
            case 7:
                month = "July";
                season = "Summer";
                break;
            case 8:
                month = "August";
                season = "Summer";
                break;
            case 9:
                month = "September";
                season = "Fall";
                break;
            case 10:
                month = "October";
                season = "Fall";
                break;
            case 11:
                month = "November";
                season = "Fall";
                break;
            case 12:
                month = "December";
                season = "Winter";
                break;
            default:
                month = "Invalid Input";
                season = "Invalid Input";
                break;
        }
        System.out.println(month);
        System.out.println(season + " from 1st switch");
        switch (month) {
            case "January":
            case "February":
            case "December":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}