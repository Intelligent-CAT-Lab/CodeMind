import java.util.*;
public class p02831 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b/gcd(a,b));
    }

    public static int gcd(int a, int b) {
        while (b!= 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}