package WhileLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String strToReverse ="DevX School";
        int i= strToReverse.length();
        while ( i>0){
            System.out.print(strToReverse.charAt(i-1));
          i--;
        }
    }
}
