package Methods;

public class MethodsWithAndWithoutReturnType {
    public static void main(String[] args) {
       // int sum1=1+2;
       // System.out.println("the result of sum1= " + sum1);
       // int sum2=2+4;
       // System.out.println("the result of sum2= " + sum2);
        int firstSum = sumUpTwoNumbers(0,7);
        System.out.println("the value of first operation(sum) " + firstSum);
        multiplyTwoNumbers(2,4);
    }
    private static int sumUpTwoNumbers(int num1, int num2) {
        int sum = num1+num2;
        // return is a key word of a method that specifies an end of the function
        // and returns the result which the programmer has specified.
        // whatever comes after the return keyword is what comes out of the method when it's called.
        return sum;
    }
    private static void multiplyTwoNumbers(int num1, int num2) {
        int product = num1*num2;
        System.out.println("the value of second operation(product) " +product);
    }
}
