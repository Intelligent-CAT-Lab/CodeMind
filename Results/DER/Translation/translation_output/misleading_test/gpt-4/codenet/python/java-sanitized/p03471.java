import java.util.Scanner;

public class p03471 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if ((y - (i * 10000 + j * 5000)) / 1000 == (n - i - j)) {
                    System.out.println(i + " " + j + " " + (n - i - j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}