package Advanced_Java;

interface car{
    //No need to mention abstract.
    //Class can be used by implements from interface
    public void driving();

}

class alto implements car{
    public void driving(){
        System.out.println("Driving...");
    }
}

public class interfaceTopic {
    public static void main(String[] args) {
        //We can only get methods from interface
        //A class can implement multiple interfaces
        //Inheritance is valid

        car obj = new alto();
        obj.driving();
    }
}
