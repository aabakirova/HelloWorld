package JavaLesson;

public class VariableExample {
    public static void main(String[] args) {

        int x=1;
        int y=3;

        System.out.println("Variable Example " + x);
        System.out.println("Second Example " + y);
        System.out.println("The sum of two: " + " = "+(x+y));

        int sum;
        sum=x+y;

        System.out.println("Second way to sum is to declare another variable and assign x+y to the variable: " + " = " +sum);
        System.out.println("Third sum syntax is '+ Integer.sum(x,y)': " + " = " + Integer.sum(x,y));
    }
}
