import java.util.Scanner;

public class p03648 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.close();

        int a = K / 50;
        int b = K % 50;
        String[] ans = new String[50 - b];

        for (int i = 0; i < 50 - b; i++) {
            ans[i] = String.valueOf(a + i);
        }

        for (int i = 0; i < b; i++) {
            ans[50 - b + i] = String.valueOf(a + 50 - b + i + 1);
        }

        System.out.println(String.join(" ", ans));
    }
}