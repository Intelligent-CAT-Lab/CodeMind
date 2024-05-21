import java.util.*;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long ans = Math.max(a * c, Math.max(a * d, Math.max(b * c, b * d)));
        System.out.println(ans);
    }
}