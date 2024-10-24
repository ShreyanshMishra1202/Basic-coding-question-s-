import java.util.*;
public class twostringanagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int q=0;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                char c=s1.charAt(i);
                int p1=0,p2=0;
                for(int j=0;j<s2.length();j++){
                    if(c==s2.charAt(j)){
                        p2++;
                    }
                    if(c==s1.charAt(j)){
                        p1++;
                    }
                }
                if(p1!=p2){
                    q=1;
                    break;
                }
            }
        }
        else{
            q=1;
        }
        if(q==0){
            System.out.println("Anagrams");
            
        }
        else{
            System.out.println("Not Anagrams");
        }
        sc.close();
    }
}
