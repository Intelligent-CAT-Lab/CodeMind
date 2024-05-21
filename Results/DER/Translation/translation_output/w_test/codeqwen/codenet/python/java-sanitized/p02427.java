import java.util.Scanner;

public class p02427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        run(n);
    }

    public static void run(int n) {
        for (int i = 0; i < (1 << n); i++) {
            System.out.print(i + ":");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}