import java.util.*;
public class p02801 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] al=new char[26];
        for(int i=0;i<26;i++)
        {
            al[i]=(char)(i+97);
        }
        int idx=Arrays.binarySearch(al,s.charAt(0));
        System.out.print(al[idx+1]);
    }
}