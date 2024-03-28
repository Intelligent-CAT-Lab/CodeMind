import java.util.Scanner;

public class p02427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < Math.pow(2, n); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    sb.append(" ").append(j);
                }
            }
            System.out.println(i + ":" + sb.toString().trim());
        }
    }
}