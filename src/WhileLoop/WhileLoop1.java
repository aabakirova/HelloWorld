package WhileLoop;

public class WhileLoop1 {
    public static void main(String[] args) {
        String str1="";
        // "G" stop the program when str3 is "GGG"
        while (!str1.equals ("GGG")){
            str1 = str1.concat("G");
            System.out.println(str1);
        }
    }
}
