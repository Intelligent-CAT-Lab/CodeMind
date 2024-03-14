import java.util.*;
public class p03534 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=0,b=0,c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a') a++;
            else if(ch=='b') b++;
            else c++;
        }
        if(Math.max(Math.abs(a-b),Math.abs(b-c),Math.abs(c-a))<=1) System.out.println("YES");
        else System.out.println("NO");
    }
}