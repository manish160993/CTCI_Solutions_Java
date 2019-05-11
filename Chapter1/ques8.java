import java.util.*;

class ques8{

    static void zeroMatrix(int[][] arr){
        boolean[] row = new boolean[arr.length];
        boolean[] col = new boolean[arr[0].length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0; i<row.length; i++){
            if(row[i]){
                nullifyRow(arr,i);
            }
        }
        for(int i=0; i<col.length; i++){
            if(col[i]){
                nullifyCol(arr,i);
            }
        }
    }
    static void nullifyCol(int[][] arr, int j){
        for(int i=0; i<arr.length; i++){
            arr[i][j] = 0;
        }
    }
    static void nullifyRow(int[][] arr, int j){
        for(int i=0; i<arr[0].length; i++){
            arr[j][i] = 0;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        zeroMatrix(arr);
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}