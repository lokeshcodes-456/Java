package Advanced_Java;

// Creating users own custom exception by extending exception class to users class

class egException extends Exception{
    public egException(String str){
        super(str);
    }
}

public class customException{
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try{
            j = 18/i;
            if(j==0){
                throw new egException("J is Zero");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}