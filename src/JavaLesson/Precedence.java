package JavaLesson;

public class Precedence {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 1, result;
        result = a-++c-++b;
        System.out.println(result);
        int x = 10;
        int y = 8;
        int z = -(x++ * (1+2)/1) + ++y;
        System.out.println(z);
        boolean resultBoolean = (x++ * 2) < (x++ * 2);
        System.out.println(resultBoolean);
        int theNum = 10;
        int theSecond = 20;
        boolean resultBoolean2 =
                ((++theNum * 1) == (theSecond *2) +1) && false;
        System.out.println(resultBoolean2);
    }
}