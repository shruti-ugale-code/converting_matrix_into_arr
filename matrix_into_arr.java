import java.util.Arrays;

public class matrix_into_arr {
    public static void main(String[] args) {


        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        arr(matrix);
    }
    public static void arr(int arr[][]){
        int r=arr.length;
        int c=arr.length;

        int a[]=new int[r*c];
        int index=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                a[index]=arr[i][j];
                index++;



            }


        }
        System.out.println(Arrays.toString(a));
    }
}
