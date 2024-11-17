import java.util.Scanner;

public class Sumof2Darray {
    public static int sum(int m[][],int r,int c) {
        int s=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                s+=m[i][j];
            }
        }
        return s;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The No. of Rows:");
        int r=sc.nextInt();
        System.out.print("Enter The No. of Columns:");
        int c=sc.nextInt();
        int m[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("SUM = "+sum(m, r, c));
        sc.close();
    }
}
