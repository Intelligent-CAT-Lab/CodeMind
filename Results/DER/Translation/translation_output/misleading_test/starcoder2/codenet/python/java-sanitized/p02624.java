import java.util.*;

public class p02624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (n / i) * (n / i + 1) / 2;
        }
        System.out.println(sum);
    }
}