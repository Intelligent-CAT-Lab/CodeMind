import java.util.*;
public class p03315 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int e=0,f=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='+')
                e++;
            else
                f++;
        }
        System.out.println(e-f);
    }
}