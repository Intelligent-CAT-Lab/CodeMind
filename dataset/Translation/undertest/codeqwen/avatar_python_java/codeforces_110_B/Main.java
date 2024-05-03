import java.util.*;

public class codeforces_110_B {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 4; i++) {
            sb.append("abcd");
        }
        sb.append("abc".substring(0, n % 4));
        System.out.println(sb.toString());
    }
}