package JavaLesson;

public class DataTypeRecap {
    public static void main(String[] args) {
        byte chicagoSpeedLimit = 120;
        byte neYorkSpeedLimit = 80;
        //a variable can be assigned by previously assigned variable
        byte laSpeedLimit = chicagoSpeedLimit;
        System.out.println("Chicago Speed Limit is " + chicagoSpeedLimit);
        System.out.println("New York Speed Limit is " + neYorkSpeedLimit);
        System.out.println("Chicago Speed Limit is " + laSpeedLimit);
        int youtubeViews = 4500000;
        int nambaViews = 1000000;
        System.out.println(youtubeViews + " " + nambaViews);
        /*multiple variables of the same data type can be put in single line and comma separated
        but it's not practiced in the real world
        */
        float chingizAitmatov = 10.0f, subtleArtRating = 7.9f, elonMask = 9.9f;
        System.out.println("The Day Lasts More Than a Hundred Years's Rating: " + chingizAitmatov);
        System.out.println("Subtle Art Of not giving a ffff " + subtleArtRating );
        System.out.println("Elon Musk Biography " + elonMask);
        /*the larger size data type "container" (f.e. long) can contain the smaller container in this example
        int is the smaller size container
        */
        int carPrice = 1000;
        long moreExpensiveCar = carPrice;

        long chinaPopulation = 1500000l;
        int chinaPopulationInt = 1500000;
        /* the example of incompatible data types:
        because the data type of the variable 'chinaPopulation' is
        long it cannot be assigned as int data type even though the variable's
        value is within the range of the data type value range
        */
        //int indiaPopulation = chinaPopulation;
        //decimal numbers
        float largestDecimalPointForFloat = 2147483649888.9999999999f;
        float nextDecimalPointCheckFloat = 0.916111559f;
        System.out.println("float rounded " + nextDecimalPointCheckFloat);
        System.out.println("This is over the float value range : " + largestDecimalPointForFloat + " rounds the whole number too?");
        double largestDecimalPointForDouble = 15.99999999999999999999;
        //double largestDecimalPointForDouble = 15.99999999999999999999;
        int integerHolder = 6000;
        double doubleHolder = integerHolder;
        System.out.println(doubleHolder);




    }
}
