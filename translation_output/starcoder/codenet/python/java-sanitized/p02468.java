import java.util.*;
public class p02468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = 1000000007;
        System.out.println(Math.pow(m,n)%mod);
    }
}