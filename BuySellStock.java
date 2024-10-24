import java.util.Arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int n=arr.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        int pr[]=new int[n];
        for(int i=0;i<n;i++){
            pr[i]= (rightmax[i]-arr[i]);
        }
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Left Max : "+Arrays.toString(leftmax));
        System.out.println("Right Max : "+Arrays.toString(rightmax));
        System.out.println("PROFITS : "+Arrays.toString(pr));

    }
}
