import java.util.Scanner;

public class p03896 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n - 2 / n; i++) {
            if (n < 3) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n - 1; j++) {
                    sb.append((i - ~(j ^ (n % 2 < (j + 2 < n > i * 2))) % n + 1).toString());
                    if (j < n - 2) {
                        sb.append(" ");
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }
}