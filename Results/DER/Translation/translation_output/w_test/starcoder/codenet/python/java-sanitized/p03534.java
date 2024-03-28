import java.util.*;
public class p03534 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=0,b=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') a++;
            if(s.charAt(i)=='b') b++;
            if(s.charAt(i)=='c') c++;
        }
        if(Math.max(Math.abs(a-b),Math.abs(b-c),Math.abs(c-a))<=1) System.out.println("YES");
        else System.out.println("NO");
    }
}