// How do you find out if the two given strings are anagrams?
import java.util.*;
public class anagramString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3[]=s1.split("");
        String s4[]=s2.split("");
        Arrays.sort(s3);
        Arrays.sort(s4);
        int c=0;
        for(int i=0;i<s3.length;i++){
            if(s3[i].equals(s4[i])){
                c++;
            }
        }
        if(c==s3.length){
        System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        sc.close();
    }
}

