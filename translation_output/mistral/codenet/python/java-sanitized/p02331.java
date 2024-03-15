import java.util.*;

public class p02331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = Math.pow(k, n) % 1000000007;
        System.out.println(ans);
    }
}