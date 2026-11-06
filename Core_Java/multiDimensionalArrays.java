import java.util.*;

public class multiDimensionalArrays {
    public static void main(String[] args) {
        
        //This is used for making mxn matrices and basically in DSA
        //Calculated by rows and columns

        Scanner sc = new Scanner(System.in);
        int nums[][] = new int[3][3];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
        sc.close();
        //The whole time complexity is O(n^2), the highest ever taken
    }
}
