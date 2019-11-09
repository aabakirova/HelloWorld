package Methods;

public class NewLife {
    public static void main(String[] args) {

        boolean firstExample = isOldEnoughToDrive(17);
        System.out.println("are you eligible? " + firstExample);


    }

    public static boolean isOldEnoughToDrive(int age) {
        boolean isOldEnough;
        if (age >= 18) {
            isOldEnough = true;
        } else {
            isOldEnough = false;
        }
        return isOldEnough;
    }
}

