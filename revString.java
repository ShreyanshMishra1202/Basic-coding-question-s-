// How do you reverse a string?

import java.util.*;
public class revString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char v;
        char ch[]=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            v=ch[i];
            ch[i]=ch[j];
            ch[j]=v;
            i++;j--;
        }
        System.out.println(String.valueOf(ch));
        sc.close();
    }
}