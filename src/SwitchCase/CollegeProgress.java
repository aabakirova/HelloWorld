package SwitchCase;

import java.util.Scanner;

public class CollegeProgress {
    // 1y Basic Algebra-CS    --Economics
    // 2y Advanced Algebra-CS --Economics
    // 3y Trigonometry-CS   //Statistics -- Economics
    // 4y Calculus 1-CS
    // 5y Calculus 2-CS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your major?");
        String major = sc.next();
        System.out.println("What year in college?");
        int year = sc.nextInt();
        String course;

        switch (major.toLowerCase()) {
            case "cs":
                switch (year) {
                    case 1:
                        course = "Basic Algebra";
                        break;
                    case 2:
                        course = "Advanced Algebra";
                        break;
                    case 3:
                        course = "Trigonometry";
                        break;
                    case 4:
                        course = "Calculus 1";
                        break;
                    case 5:
                        course = "Calculus 2";
                        break;
                    default:
                        course = "Entry is outside of the course scope";
                        break;
                }
                break; // case break (20)
                case "economics":
                    switch (year) {
                        case 1:
                            course = "Basic Algebra";
                            break;
                        case 2:
                            course = "Advanced Algebra";
                            break;
                        case 3:
                            course = "Statistics";
                            break;
                        case 4:
                        case 5:
                            course = "Your math course is completed";
                            break;
                        default:
                            course = "Entry is outside of the course scope";
                            break;
                    }
                    break; //case break (42)
            default:
                course = "We don't offer " + major + " in our school yet";
        }
        System.out.println("In year number " +year+" for major: " + major );
        System.out.println("Course Info: " + course);
    }
}
