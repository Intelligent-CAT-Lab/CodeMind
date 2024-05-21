import java.util.Scanner;

public class p03896 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n - 2 / n; i++) {
            System.out.println(generateLine(n, i));
        }
    }

    private static String generateLine(int n, int i) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n - 1; j++) {
            int value = (i - ~ (j ^ (n % 2 < (j + 2 < n? 1 : 0)))) % n + 1;
            sb.append(value).append(" ");
        }
        return sb.toString().trim();
    }
}