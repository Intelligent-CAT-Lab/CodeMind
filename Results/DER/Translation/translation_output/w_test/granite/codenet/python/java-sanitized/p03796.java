import java.util.*;

public class p03796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            result %= 1000000007;
        }
        System.out.println(result);
    }
}