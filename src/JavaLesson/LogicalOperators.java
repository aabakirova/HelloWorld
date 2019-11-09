package JavaLesson;

public class LogicalOperators {

    public static void main(String[] args) {
        boolean isOld = false;
        boolean isOld2 = true;

        boolean oldResult = isOld || isOld2;
        System.out.println("Is Old Result: " + oldResult);
        boolean isHusbandMillionaire = true;boolean isWifeMillionaire = false;
        boolean isChildMillionaire = isHusbandMillionaire || isWifeMillionaire;System.out.println("Is child a millionaire " + isChildMillionaire);

        boolean isSunnny = true;boolean isRainny = true;
        boolean isRainbow = isSunnny && isRainny;
        System.out.println("will there be a rainbow " + isRainbow);

        boolean isSunnny1 = true;boolean isRainny1 = false;
        boolean isRainbow1 = isRainny1 && isSunnny1;
        System.out.println("will there be a rainbow " + isRainbow1);
        boolean negating = !false; // ! mark will change the false to true and true to false;
        System.out.println("The value of negated boolean is: " + negating);

        boolean negating2 = !true;
        boolean trueBoolean = true;
        System.out.println("The value of true Boolean: " + trueBoolean);System.out.println("The value of negated boolean 2: " + negating2);


    }
}