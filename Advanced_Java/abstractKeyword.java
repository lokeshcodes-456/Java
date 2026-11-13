package Advanced_Java;

// Abstract methods can be declared inly in abstract class
// Objects can be created only from concrete classes that is non abstract classes
// An abstract class can have 2 or more abstract methods.
// Every abstract method in abstract needs to be implemented in child class.

abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing Music");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

public class abstractKeyword {
    public static void main(String[] args) {
        
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
