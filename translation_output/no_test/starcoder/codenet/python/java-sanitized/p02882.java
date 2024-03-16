import java.util.*;
public class p02882 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double h = x/a*a;
        if(h>=b/2){
            double V = 2*((a*a)*b - x)/a*a*a;
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        }
        else{
            double V = a*(b*b)/(2*x);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        }
    }
}