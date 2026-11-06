
// So the class calc we declared here acts as blueprint and template which stores the values and performs operations directed by user.
// So the object is an instance of an class which is instantiated from class and the operations are done.
// if the method is non static we need to create object else the method is static it'll run by itself.

// Access modifiers are public, private, protected
class Calc{
    public int add(int n1,int n2){ // Return type must satisfy the datatype mentioned at function declaration
        return n1+n2;
    }
}

public class classAndObjects {
    public static void main(String[] args) {
        Calc c = new Calc();// Initialising the object using class and using new keyword
        System.out.println(c.add(4,5)); //we can directly print or store the value
    }
}
