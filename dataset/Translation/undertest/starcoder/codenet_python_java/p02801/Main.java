import java.util.*;
public class p02801 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        char[] al=new char[26];
        for(int i=0;i<26;i++)
            al[i]=(char)(i+97);
        System.out.print(al[al.length-1-al[c-'a']]);
    }
}