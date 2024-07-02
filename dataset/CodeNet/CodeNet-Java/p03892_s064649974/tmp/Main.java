import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
System.out.println("[INST]8;a;sc.nextLong();"+a);
System.out.println("[INST]8;b;sc.nextLong();"+b);
System.out.println("[INST]8;c;sc.nextLong();"+c);
System.out.println("[INST]8;d;sc.nextLong();"+d);
        long dx=Math.abs(a-c),dy=Math.abs(b-d);
System.out.println("[INST]9;dx;Math.abs(a-c);"+dx);
System.out.println("[INST]9;dy;Math.abs(b-d);"+dy);
        long ans = help(Math.min(dx,dy),Math.max(dx,dy));
System.out.println("[INST]10;None;Math.min(dx,dy);"+Math.min(dx,dy));
System.out.println("[INST]10;None;Math.max(dx,dy);"+Math.max(dx,dy));
        System.out.println(ans);
    }
    static long help(long w, long h){
        if(w==0) return 0;
        // w<=h
        long c = gcd(w,h);
        if(c==1) return w+h-1;
        else return c*help(w/c,h/c);
    }
    static long gcd(long a, long b){
        if(a<b){
            long c=a;
            a=b;
            b=c;
        }
        while(a%b!=0){
            long c = a%b;
            a = b;
            b = c;
        }
        return b;
    }
}
