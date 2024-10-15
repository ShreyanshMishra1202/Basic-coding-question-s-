// How do you calculate the number of vowels and consonants in a string?

import java.util.*;
public class countVowelConsonant {
    public static int vowels(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vow=0,con=0;
        for(int i=0;i<s.length();i++){
            int p=(int)s.charAt(i);
            if(p>64 && p<91 || p>96 && p<123){
                if(vowels(s.charAt(i))==1){
                    vow++;
                }
                else{
                    con++;
                }
            }
        }
        System.out.println("Vowels = "+vow+"\nConsonant = "+con);
        sc.close();
    }
}
