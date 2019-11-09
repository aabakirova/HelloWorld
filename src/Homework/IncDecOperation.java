package Homework;

public class IncDecOperation {
        public static void main(String[] args)
        {
            int x=1;
            System.out.println("x=1 should be 1; Test run = "+x);
            x++;
            System.out.println("after x++ post increment x should return 2; Test run:");
            System.out.println(x); //2
            ++x;
            System.out.println("pre increment ++x should be 3; Test run:");
            System.out.println(x); //3
            int y=3;
            System.out.println("assigning 3 to y should return 3. Test run:");
            System.out.println(y); //3
            --y;
            System.out.println("pre decrement should decrease to 1 and return 2. Test run:");
            System.out.println(y);  //2
            y--;
            System.out.println("post decrement should decrease to 1 when return y. Test run:");
            System.out.println(y);  //1
        }
    }
