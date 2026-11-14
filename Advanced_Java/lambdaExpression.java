package Advanced_Java;

@FunctionalInterface 
interface A{
    void show();
}

public class lambdaExpression {
    public static void main(String[] args) {
    // -> This is lambda expression
    A obj = () ->{ // Object is automatically created using lambda expression
        System.out.println("In Show");
    };
    obj.show();
    }

    /*
        If passing the value as parameter

        A obj = (int i) -> {
            Sout("in show "+i);
        }
        obj.show(5);
    */

    /*
        With return type

        @FunctionalInterface
        interface A{
            int add(int a,int b);
        }

        Demo{
            psvm(){
                A obj = (int i,int j)->
                {
                    return i+j;
                };
                int res = obj.add(5,4);
                Sout(res);
            }
        }

        Lamba expression only works for functional Interface.
    */
}
