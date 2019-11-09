package Homework;

public class IncDecAssignment2 {
    public static void main(String[] args){
        int x=1;
        //Expected output for x is 1
        boolean test1=x==1;
        System.out.println(test1+" x=1");

        //Expected output of ++x (pre-incremented x) is 2
        boolean test2=++x==2;
        System.out.println(test2+" ++x=2");

        //Expected output of x++ (post-incremented x) is 2 and next x becomes 3
        boolean test3=x++==2;
        boolean test4=x==3;
        System.out.println(test3+" x++=2");
        System.out.println(test4+" x=3");

        //Expected output of --x (pre-decremented x) is 2
        boolean test5=--x==2;
        System.out.println(test5+" --x=2");

        //Expected output of x-- (post-decremented x) is 2 and next x becomes 1
        boolean test6=x--==2;
        boolean test7=x==1;
        System.out.println(test6+" x--=2");
        System.out.println(test7+" x=1");
    }
}
