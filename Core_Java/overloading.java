//method overloading is known as same method name but different parameters.
//Decides which method to run at compile time

class calc{
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}

public class overloading {
    public static void main(String[] args) {
        calc cl = new calc();
        System.out.println(cl.add(2,5));
    }
}
