import java.util.*;

public class arithmetic{
    public static void main(String[] args) {
        //There are 5 operators +, -, *, /, %

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b);

        sc.close();
    }
}