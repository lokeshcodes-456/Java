package Advanced_Java;

//The class created in main class and with no name is anonymous inner class

class A{
    public void show(){
        System.out.println("In A show");
    }
}

public class anonymousInner {
    public static void main(String[] args) {
        A obj = new A(){
            //Created inside the A object 
            public void show(){
                System.out.println("In B Show");
            }
        };
        // Now the B show will override A show
        // We can create object of abstract class and create anonymous class and it wont throw error

        /*
        abstract class car{
            Method(){

            }
        }

        car obj = new car(){
            public void show(){
                Sout("Drive"); //Here the error wont be thrown
            }
        }
        */
    }
}
