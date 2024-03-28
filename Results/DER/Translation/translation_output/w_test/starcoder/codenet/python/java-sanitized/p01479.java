import java.util.*;
public class p01479 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=0,c=0,p=0,b=' ';
        while(i<s.length()){
            if(s.charAt(i)==b){
                if(c>p)r=b;
                p=c;
            }
            b=s.charAt(i);
            i+=s.charAt(i)=='c'?3:7;
            c++;
        }
        System.out.println(r=='e'?"egg":"chicken");
    }
}