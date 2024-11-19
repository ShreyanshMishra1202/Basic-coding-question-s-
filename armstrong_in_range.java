import java.util.*;
public class armstrong_in_range {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++){
			String s=Integer.toString(i);
			int l=s.length();
			int p=i,k=0;
			while(p!=0){
				k+=(Math.pow((p%10),l));
				p/=10;
			}
			if(k==i){
				System.out.println(i);
			}
		}
		sc.close();
    }
}