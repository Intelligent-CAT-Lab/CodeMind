import java.util.*;
import java.lang.*;

public class codeforces_110_B {
    public static void main(String[] args) {
        int t = 1;
        for (int i = 0; i < t; i++) {
            solution();
        }
    }

    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 4; i++) {
            sb.append("abcd ");
        }
        sb.append(new String[]{"", "a", "ab", "abc"}[n % 4]);
        System.out.println(sb.toString());
    }
}