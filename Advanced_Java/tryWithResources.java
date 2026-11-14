package Advanced_Java;

public class tryWithResources {
    public static void main(String[] args) {
        
        // If we want try block but not catch block we can use finally block
        //Finally block will be definitely used whether try is executed or not - It can be used to close resources

        try{
            //Some exception
        }
        finally{
            //Execute definitely
        }
        //First finally block will be executed and then remaining block, first finally block will be printed.

        /*
            Try with resource
            try(BufferedReader br = new Bufferedreader(new InputStreamReader(System.in))){
            
            }
            The resource gets automatically closed
        */
    }
}
