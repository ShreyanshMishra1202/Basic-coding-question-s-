// How do you reverse an array?

import java.util.*;
public class revarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        int i=0,j=l-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
