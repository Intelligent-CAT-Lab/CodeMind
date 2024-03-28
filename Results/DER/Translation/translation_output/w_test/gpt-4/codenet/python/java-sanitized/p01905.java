import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p01905 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < M; i++) {
            a.add(scanner.nextInt());
        }
        int num = N - M;
        int ans = 0;
        while (num > 0) {
            ans += 1;
            num -= 1;
        }
        System.out.println(ans - 1);
        scanner.close();
    }
}