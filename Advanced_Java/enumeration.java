package Advanced_Java;

public class enumeration {

    enum status{
        Running, Failed, Pending, Success; //Named Constants
    }

    public static void main(String[] args) {
        
        status s = status.Running; //Accessed using enum class name and accessing the constants in it
        System.out.println(s);

        // .ordinal() used to call the order of the constants in enum class
        // Compare different cases using switch and if else
        // We cant extend enum class
        // By default enum in java extends java class methods

        /*
            enum Laptop{
                Macbook(2000), XPS(2200), Surface(1500), thinkpad(1800);
            }
            private int price;
            private Laptop(int price){
                this.price = price;
            }
            
            if price of an object is not mentioned we would construct a default constructor.
        */
    }
}
