import java.util.Scanner;
import java.lang.Math;

public class p02882 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double h = x/Math.pow(a,2);
        double ans;
        if(h>=b/2){
            double V = 2*((Math.pow(a,2)*b - x)/Math.pow(a,3));
            ans = Math.toDegrees(Math.atan(V));
        }
        else{
            double V = a*(Math.pow(b,2))/(2*x);
            ans = Math.toDegrees(Math.atan(V));
        }
        System.out.println(ans);
    }
}