package Advanced_Java;

import java.util.*;
import java.io.*;
public class userInput {
    public static void main(String[] args) throws IOException{
        
        System.out.println();
      //Class  Object   Method

        System.in.read(); // Gives ASCII value

        //BufferReader is an IO and it belongs to Java.io class

        //Two types of inputs can be given by InputStreamReader and scanner class
        // Until Java 1.5 Buffer reader is used later everything changed to easier way of scanner class

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        bf.close(); //To close bufferreader

        //Using scanner class

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

        sc.close(); //Closing scanner class

    }
}
