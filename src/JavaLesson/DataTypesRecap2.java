package JavaLesson;

public class DataTypesRecap2 {
    public static void main(String args[]) {

        byte chicagoSpeedLimit = 120;
        byte newYorkSpeedLimit = 80;
        byte laSpeedLimit = chicagoSpeedLimit;
        System.out.println("Chicago Speed Limit is " + chicagoSpeedLimit);
        System.out.println("New York Speed Limit is " + newYorkSpeedLimit);
        System.out.println("LA Speed Limit is " + laSpeedLimit);


        int nambaViews = 1000000, youtubeViews = 150000;
        float whiteRainRating = 10.0f, subtleArtRating = 7.9f, elonMaskRating = 9.9f;
        System.out.println("White Rain Composition Rating: " + whiteRainRating);
        System.out.println("Subtle Art Of not giving a ffff" + subtleArtRating);
        System.out.println("Elon Musk Biography " + elonMaskRating);
        System.out.println(youtubeViews + " " + nambaViews);
        System.out.println("YouTube views: " + youtubeViews);


        long chinaPopulation = 1500000000l;
        System.out.println(chinaPopulation);
        int chinaPopulationInt = 1500000;
        int indiaPopulation = chinaPopulationInt;
        byte devXStudentCount = 0;
        short jobOpeningsForSoftwareEngineers = 500;
        int devXStudentCountInt = jobOpeningsForSoftwareEngineers;
        /*
       smaller dataTypes cannot hold larger ones, despite the values are in a
        valid range.
       byte jobOpeningByte = jobOpeningsForSoftwareEngineers;
        */

        float largestDecimalPointForFloat = 0.9999999999999f;
        float nextDecimalPointCheck = 15.111111111111111f;
        //15.111111
        float nextDecimalPointCheck2 = 15.111111611111111f;
        // 15.111112
        float roundDecimalPointCheck = 22.5634567f;
        float ifWholeNumberIsMoreThanInt = 2223445565.12f;
        System.out.println(largestDecimalPointForFloat);
        System.out.println(nextDecimalPointCheck);
        System.out.println(roundDecimalPointCheck);
        System.out.println(ifWholeNumberIsMoreThanInt);
        double largestDecimalPointForDouble = 0.99999999999999999999;
        double nextDecimalPointCheckDouble = 15.1111111111111111;
        double nextDecimalPointCheckDouble2 = 15.111111611111111;
        System.out.println();
        System.out.println(largestDecimalPointForDouble);
        //1System.out.println(nextDecimalPointCheckDouble);
        // 15.111111111111111System.out.println(nextDecimalPointCheckDouble2);
        // 15.111111611111111;
        double doubleHolder = 9.112;
        float floatHolder = 8.84f;
        // int integerHolder = doubleHolder; -> incompatible types
        // int integerHolder = floatHolder; -> incompatible types
        int integerHolder = 600000;
        double doubleForInteger = integerHolder;
        long longNumberHolder = 5124242l;
        double doubleForLong = longNumberHolder;

        System.out.println(doubleForInteger);
        //600000.0System.out.println(doubleForLong);
        // 5124242.0
        byte byteHolder = 127;
        float floatForByte = byteHolder;
        System.out.println(floatForByte);
        // 127.0
        int integerForFloat = 12;
        float floatForInt = integerForFloat;
        System.out.println(floatForInt);
        // 12.0

        char charsHolder = 'A';// Decimal is 65
        System.out.println(charsHolder);
        double doubleForChars = charsHolder;
        System.out.println(doubleForChars);
        String str = "Hello World!!!";
        System.out.println(str);
        // double doubleForString = str; String can only be assigned to String
    }

}