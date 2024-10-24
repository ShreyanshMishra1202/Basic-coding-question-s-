import java.util.Scanner;

public class search_maxmin_in2D {
    static void find(int m[][],int max,int min){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==max){
                    System.out.println("Maximum number "+max+" is present at ("+i+","+j+").");
                }
                if(m[i][j]==min){
                    System.out.println("Minimum number "+min+" is present at ("+i+","+j+").");
                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int m=matrix.length,n=matrix[0].length;         // m = 3 as it has 3 rows while n=3 as it has 3 column(length of first element(array) of matrix)
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j]>max)
                max= matrix[i][j];
                if(matrix[i][j]<min)
                min= matrix[i][j];
            }
        }
        find(matrix,max,min);
        sc.close();

    }
}
