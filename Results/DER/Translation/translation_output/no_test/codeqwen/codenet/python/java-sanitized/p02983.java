import java.util.Scanner;

public class p02983 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        scanner.close();

        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    int product = (i * j) % 2019;
                    if (product < min) {
                        min = product;
                    }
                }
            }
            System.out.println(min);
        }
    }
}