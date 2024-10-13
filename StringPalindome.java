// How can you check whether a string is a palindrome or not?

import java.util.Scanner;

public class StringPalindome {
    public static String Check(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return "Not Palindrome";
            }
            i++;j--;
        }
        return "Palindrome";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Check(s));
        sc.close();
    }
}
