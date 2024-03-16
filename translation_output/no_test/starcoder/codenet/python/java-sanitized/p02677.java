import java.util.*;
public class p02677 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double l = H*360/12 + M*30/60;
        double s = M*360/60;
        double ang = Math.abs(l-s);
        double c = A*A + B*B - 2*B*A*Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}