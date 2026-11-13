class Car{
    
    static String name = "Nissan";
    //This will make the value global and not changable.
}

class config{
    //Static blocks
    static String appName;

    static{
        appName = "Chrome";
        System.out.println("Block Initialized");
    }
    //Can be accessed using class name and string name
}

public class staticKeyword {
    //Static method need not called itll be called itself by accessing through different class if its in there.
    public static int result(){
        return 2+2;
    }

    

    public static void main(String[] args) {
        System.out.println(Car.name); //Called by accessing through class name
        //The name will be same for every object.


    }
}
