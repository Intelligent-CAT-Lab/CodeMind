import java.util.*;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(generateString(n));
    }

    private static String generateString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 4; i++) {
            sb.append("abcd");
        }
        switch (n % 4) {
            case 1:
                sb.append("a");
                break;
            case 2:
                sb.append("ab");
                break;
            case 3:
                sb.append("abc");
                break;
        }
        return sb.toString();
    }
}