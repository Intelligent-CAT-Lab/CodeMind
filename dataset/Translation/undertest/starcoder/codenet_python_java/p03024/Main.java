import java.util.*;
public class p03024 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='x')
                a++;
        }
        System.out.println(a<=7?"YES":"NO");
    }
}