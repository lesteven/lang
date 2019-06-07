

public class Str {

    public static void main(String[] args) {
        String str = "Hello World";

        // strings are immutable, lowercase method returns a new string
        //  w/o affecting the old one
        String low = str.toLowerCase();
        System.out.println(str);
        System.out.println(low);
    }
}
