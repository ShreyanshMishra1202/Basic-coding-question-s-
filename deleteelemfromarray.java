import java.util.Arrays;

public class deleteelemfromarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        arr[2]=Integer.MIN_VALUE;
        System.out.println(Arrays.toString(arr));
    }
}
