import java.util.*;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long ans = N / (A + B) * A;
        long rem = N % (A + B);
        ans += Math.min(rem, A);
        System.out.println(ans);
    }
}