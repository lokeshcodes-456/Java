//Creating object of childclass with type as parent class.

class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new B();// So we can use child's class to create object reference while using parent class type and access methods in parent class
        obj.show(); 
    }
}
