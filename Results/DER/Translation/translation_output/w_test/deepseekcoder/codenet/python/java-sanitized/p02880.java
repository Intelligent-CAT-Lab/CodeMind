import java.util.Scanner;

public class p02880 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j == N) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
    }
}