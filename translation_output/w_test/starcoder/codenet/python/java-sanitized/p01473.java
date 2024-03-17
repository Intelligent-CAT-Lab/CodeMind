import java.util.*;
public class p01473 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int lS = S.length();
        int[] d = new int[26];
        for(int i=0;i<lS;i++)
            d[S.charAt(i)-'a']++;
        int dd = 0;
        for(int i=0;i<26;i++)
            if(d[i]%2!= 0)
                dd++;
        if(lS%2 == 0 && dd!= 0)
            System.out.println(0);
        else if(lS%2 == 1 && dd!= 1)
            System.out.println(0);
        else{
            int dnm = 1;
            for(int i=0;i<26;i++)
                dnm *= Math.pow(d[i]/2,d[i]/2);
            System.out.println(Math.round(Math.pow(f(lS/2),