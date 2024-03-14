import java.util.Scanner;

public class p03285 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i <= 25 && !found; i++) {
            for (int j = 0; j <= 20 && !found; j++) {
                if (4 * i + 7 * j == N) {
                    found = true;
                    System.out.println("Yes");
                }
            }
        }
        if (!found) {
            System.out.println("No");
        }
    }
}