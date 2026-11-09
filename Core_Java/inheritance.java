//Java is throwing a error so we manually compiled this 

class calc{
    public int add(int a,int b){
        return a+b;
    }
    
    public int sub(int a,int b){
        return a-b;
    }
}
// Using inheritance for extending properties and behaviours of one class to another class
class advCalc extends calc{
    public int mul(int a,int b){
        return a*b;
    }

    public int div(int a,int b){
        return a/b;
    }
}

public class inheritance {
    public static void main(String[] args) {
        //Using advCalc and creating the object of advCalc will automatically let's us use the methods of calc class too

        advCalc adv = new advCalc();
        System.out.println(adv.add(2,3));
    }
}
