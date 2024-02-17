import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=0,min=0;
        max=min(a,b);
        if(a+b>=n){
            min=a+b-n;
        }
        out.println(max+" "+min);
    }
}