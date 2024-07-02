import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
System.out.println("[INST]8;n;sc.nextInt();"+n);
        int a=sc.nextInt();
System.out.println("[INST]9;a;sc.nextInt();"+a);
        int b=sc.nextInt();
System.out.println("[INST]10;b;sc.nextInt();"+b);
        int max=0,min=0;
        max=min(a,b);
System.out.println("[INST]12;max;min(a,b);"+max);
        if(a+b>=n){
            min=a+b-n;
        }
        out.println(max+" "+min);
    }
}