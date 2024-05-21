import java.util.*;

public class p02624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n/i; j++) {
                count += i;
            }
            sum += count;
        }
        System.out.println(sum);
    }
}