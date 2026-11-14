package Advanced_Java;

/*
    Errors:
        These are of three typres : Compile, Runtime, Logical

        Compile : If compile finds error
        Runtime: Exceptional handling
        Logical: Everything is working fine until our output is not matching with our assumed output.

    In exception handling we'll handle exceptions using try-catch block.

    If exception is not handled properly the program stops abruptly and causes runtime error, further code isn't executed.
    Multiple try blocks can be executed.
    catch block is executed only if exemptions.

    Printing e will print the specific error caught
    We can create multiple catch blocks for a try block

    we've multiple exception classes for different scenarios
        Arithematic Exception
        ArrayIndexOutofBounds

    Parent exception block should be at last otherwise error is passed.
*/

public class exceptions {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        }     //Class   Object
        catch(Exception e){
            System.out.println("Something went wrong"+e);
        }
        System.out.println(j);
    }
}
