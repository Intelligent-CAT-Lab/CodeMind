import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();

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
