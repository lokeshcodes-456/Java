package Advanced_Java;

// A class Inside a class and accessing methods inside the class

class Outer{
    public void show(){
        System.out.println("In outer class");
    }
    class Inner{
        public void config(){
            System.out.println("In inner class");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        //Object of outer class
        Outer obj = new Outer();
        obj.show();

        // Accessing inner class if no static method
        Outer.Inner obj1 = obj.new Inner();

        //if inner class is static and outer class cant be static
        //Outer.Inner obj2 = new Outer.Inner();

    }
}
