
import java.util.*;
public class counterString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print("Enter the string you want to search : ");
        String e=sc.next();
        int c=0;
        String d[]=s.split(" ");
        for(int i=0;i<d.length;i++){
            if(d[i].equals(e)){
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
