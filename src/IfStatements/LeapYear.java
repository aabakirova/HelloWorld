package IfStatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year 14");
                }
            }
        }
    }
}

      //          }
     //       } else {
   //             System.out.println("Not Leap");
   //         }
   //     }
    //    else {
    //        System.out.println();
     //   }
 //  }
//}else }
     //  System.out.println("Leap Year");
     //   }
       // }
     //   else{
      //  System.out.println("Not Leap Year");
      //  }




