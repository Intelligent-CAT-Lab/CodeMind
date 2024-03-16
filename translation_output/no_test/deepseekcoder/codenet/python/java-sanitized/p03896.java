import java.util.Scanner;

public class p03896 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n - 2 / n; i++) {
            if (n < 3) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n - 1; j++) {
                    int result = (i - ~(j ^ (n % 2 < (j + 2 < n) ? n : i * 2))) % n + 1;
                    sb.append(result).append(" ");
                }
                System.out.println(sb.toString().trim());
            }
        }
    }
}