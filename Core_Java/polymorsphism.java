class A{
    public void show(){
        System.out.println("In A Show");
    }
}

class B extends A{
    @Override //This uses to specify we're overriding method in class A
    public void show(){
        System.out.println("In B Show");
    }
}

public class polymorsphism {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); //In here B overrides A class.
    }
}
