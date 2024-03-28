import java.util.*;
public class p02995 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int lcm=c*d/Math.gcd(c,d);
        System.out.println(b-a+1-(b/c-(a-1)/c+b/d-(a-1)/d-(b/lcm-(a-1)/lcm)));
    }
}