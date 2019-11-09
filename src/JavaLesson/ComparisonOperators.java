package JavaLesson;

public class ComparisonOperators {
    public static void main(String[] args) {

    int num1 = 5;

    int num2 = 10;

    System.out.println("Is five equal to ten? " + (5==10));
    System.out.println("Is five equal to five? " + (5==5));
    System.out.println("Is 5.5 equal 10.6? " + (5.5 == 10.6));
    System.out.println("Is 5.5 equal to 5?? " + (5.0 == 5));
    //System.out.println("Is true equal to 5??" + (true == 5)); // Does not compile bc two unmatched types.
    System.out.println("Is true equal to false? " + (true == false));

    System.out.println("Is char A equal to 65? " + ('A' == 65));
    //  System.out.println("Is String Hello World equal to to char A?" + ("Hello World" == 'A')); // Does not compile bc unmatched types String to char
    System.out.println("Is Hello World equal to Hello World " + ("Hello World" == "Hello World"));
    System.out.println("Is Hello World equal to Hello World  " + ("Hello World " == "Hello World"));
    System.out.println("Is char A equal to B? " + ('A' == 'B'));


    System.out.println();
    System.out.println("Is 5 not equal to 10? " + (5 != 10));
    System.out.println("Is 5 not equal to 5? " + (5 != 5));
    System.out.println("Is 5.5 not equal 10.6? " + (5.5 != 10.6));
    System.out.println("Is 5.5 not equal to 5?? " + (5.5 != 5));
    //System.out.println("Is true not equal to 5??" + (true != 5)); // Does not compile bc two unmatched types.
    System.out.println("Is true not equal to false? " + (true != false));

    System.out.println("Is char A not equal to 65? " + ('A' != 65));
    //  System.out.println("Is String Hello World not equal to to char A?" + ("Hello World" != 'A')); // Does not compile bc unmatched types String to char
    System.out.println("Is Hello World not equal to Hello World " + ("Hello World" != "Hello World"));
    System.out.println("Is Hello World not equal to Hello World  " + ("Hello World " != "Hello World"));
    System.out.println("Is char A not equal to B? " + ('A' != 'B'));


    System.out.println();
    System.out.println("Is 10 less than 5? " + (10 < 5));
    System.out.println("Is 99.9 less than 99 " + (99.9 < 99));
    //System.out.println("Is true less than false? " + (true < false)); Does not compile bc boolean can only be compared with == or !=

    System.out.println("is A less than 67? " + ('A' < 67));
    System.out.println("is 55 < 55? " + (55 < 55));


    System.out.println();
    System.out.println("Is 10 greater than 5? " + (10 > 5));
    System.out.println("Is 99.9 greater than 99 " + (99.9 > 99));
    System.out.println("is A greater than 67? " + ('A' > 67));
    System.out.println("is 55 greater 55? " + (55 > 55));



    System.out.println();
    System.out.println("Is 10 greater than  or equal to 5? " + (10 >= 5));
    System.out.println("Is 99.9 greater than or equal to 99 " + (99.9 >= 99));
    System.out.println("is A greater than or equal to 67? " + ('A' >= 67));
    System.out.println("is 55 greater or equal to 55?" + (55 >= 55));


    System.out.println();
    System.out.println("Is 10 less than  or equal to 5? " + (10 <= 5));
    System.out.println("Is 99.9 less than or equal to 99 " + (99.9 <= 99));
    System.out.println("is A less than or equal to 67? " + ('A' <= 67));
    System.out.println("is 55 less or equal to 55? " + (55 <= 55));


    }
}