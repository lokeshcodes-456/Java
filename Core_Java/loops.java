public class loops {
    public static void main(String[] args) {
        //There are three types of loops For, While, Do While

        //While loop
        /* we need to be careful with counters and condition in this */
        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
        }

        //For loop
        for(int j=0;j<5;j++){
            System.out.println(j);
        }
        //Enhanced for loop structure
        // for(int k:arr[a]){
        //     System.out.prntln(arr[a]);
        // }

        // Do while loop - The same as while loop where the loop is executed atleast once before failing check controls or infinite loop occurs
        int h = 0;
        do{
            System.out.println(h);
            h++;
        }while(h<5);
    }
}
