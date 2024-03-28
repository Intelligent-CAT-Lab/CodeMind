import java.util.Scanner;

public class p03896 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                int val = (i - ~(j ^ (n % 2 < (j + 2 < n) && i * 2))) % n + 1;
                sb.append(val).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}