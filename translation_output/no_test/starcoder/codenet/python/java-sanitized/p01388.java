import java.util.*;
public class p01388 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=0,u=0,p=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='K')
                k++;
            if(s.charAt(i)=='U')
                u++;
            if(s.charAt(i)=='P')
                p++;
            if(s.charAt(i)=='C')
                c++;
        }
        System.out.println(Math.min(k,Math.min(u,Math.min(p,c))));
    }
}