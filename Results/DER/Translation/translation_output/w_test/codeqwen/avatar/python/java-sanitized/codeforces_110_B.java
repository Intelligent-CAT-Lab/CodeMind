import java.util.*;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 4; i++) {
            sb.append("abcd");
        }
        sb.append("abc".substring(0, n % 4));
        System.out.println(sb.toString());
    }
}