public class dataTypes {
    public static void main(String[] args) {
        //Datatypes are primitive byte, short, int, long, float, double

        byte a = 10;
        short b = 12;
        int c = 290;
        long l = 9864;
        float f = 480803.87f;
        double d = 7392894044.984984;

        // So for float we need to represent f beside the numbers.

        // Type casting Explicit
        int x = (int)f;
        System.out.println(x);

        //Implicit Typecasting
        int z = a;
        System.out.println(z);
    }
}
