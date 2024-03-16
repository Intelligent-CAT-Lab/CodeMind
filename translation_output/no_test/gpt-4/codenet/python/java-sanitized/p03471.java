import java.util.Scanner;

public class p03471 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        boolean found = false;
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= n - i; ++j) {
                int k = n - i - j;
                if (i * 10000 + j * 5000 + k * 1000 == y) {
                    System.out.println(i + " " + j + " " + k);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        
        if (!found) {
            System.out.println("-1 -1 -1");
        }
    }
}