import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
System.out.println("[INST]7;a;sc.nextDouble();"+a);
        double b = sc.nextDouble();
System.out.println("[INST]8;b;sc.nextDouble();"+b);
        double x = sc.nextDouble();
System.out.println("[INST]9;x;sc.nextDouble();"+x);

        double bottleCapacity = a*a*b;

        if(x*2 < bottleCapacity){
            //solve a*b*b/2tan8 == x
            System.out.println(Math.toDegrees(Math.atan(a*b*b/(2*x))));
        }else{
            //solve a*a*a*tan8/2 = cap-x
            System.out.println(Math.toDegrees(Math.atan(2*(bottleCapacity-x)/(a*a*a))));
        }

    }
}
