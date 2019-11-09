package JavaLesson;
public class DataType {
    public static void main(String[] args) {
        /* byte is a data type that can range from -128 to 127
        variable is a data type that can be assigned any number in this data type range
        to print the string and the variable on the same line use "+" and  variable name
        variables assignment is a statement and end with ";" */
        byte myWeight = 100;
        System.out.println("My weight is " + myWeight);
        //short can range from -32768 to 32767
        short camryPrice = 18000;
        System.out.println("Toyota Camry costs " + camryPrice);
        //int is a data type that can range from -2,147,483,648 to 2,147,483,647
        int mySalary = 150000;
        System.out.println("This is my salary " + mySalary);
        //long is a data type that can range from some endless numbers that I can't even read :)
        long chinaPopulation = 15000000000L;
        System.out.println("This is China population " + chinaPopulation);
        float gasPrice = 3.309f;
        System.out.println("Gas price is " + gasPrice);
        double stockPrices = 134.004757;
        System.out.println("Stock for Google is " + stockPrices);
        boolean isJavaFun = true;
        boolean isFishTasty = true;
        boolean isWallOrange = false;
        System.out.println("Is fish tasty? " + isFishTasty);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is wall orange? " + isWallOrange);
        String myFullName = "AA";
        String message = "My Name is ";
        String explanation = "string --> set of characters that are assembled together";
    }
}

