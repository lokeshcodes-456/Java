public class wrapperClass {
    public static void main(String[] args) {
        

        // We've wrapper classes for every primitive datatype
        /*
        int -> Integer
        char -> Character
        double -> Double

        */

        Integer num1 = 8; //Wrapper class(autoboxing to wrapper class)

        int num2 = num1.intValue(); //Unboxint Integer to int

        int num3 = num1; // (Auto unboxing Integer to int)

        //Integer.parseInt(s); this is used to take string as input and converts into int

    }
}
