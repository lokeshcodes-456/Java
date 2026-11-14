package Advanced_Java;

// We have three types of interfaces: Normal, Functional, Marker

// For functional interface we need to specify by annotation it is functional interface.
// Functional interface is known only for having one method in the interface

@FunctionalInterface //Anotation
interface A{
    void show();
}

public class functionalInterface {
    public static void main(String[] args) {

        A obj = new A(){
            //Object of another class
            public void show(){
                System.out.println("In show");
            }
        };
        obj.show();
    }
}
