package Advanced_Java;

// Extending the class from thread class for implementing thread

//Scheduler helps in executing multiple threads parallely
                //Class
class A extends Thread{
                //Compulsory to name methods as run
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("Hello");
        }
    }
}

public class multiThreads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start(); // To execute the run method
    }
}
