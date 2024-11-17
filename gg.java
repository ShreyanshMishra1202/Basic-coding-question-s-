// import java.util.Arrays;

public class gg {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int buyprice=arr[0];
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(buyprice>arr[i]){
                buyprice=arr[i];
            }
            profit=Math.max(profit,arr[i] - buyprice);
        }
        System.out.println(profit);
    }
}
