import java.util.*;public class Array2D {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int m=matrix.length,n=matrix[0].length;         // m = 3 as it has 3 rows while n=3 as it has 3 column(length of first element(array) of matrix)
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" "); 
            }
            System.out.println();
        }
        sc.close();
    }
}
