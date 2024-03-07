import java.util.Scanner;

public class p03704 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            int n = (int) Math.pow(10, i);
            int f = 0;
            for (int j = -9; j <= 9; j++) {
                if (Math.abs(D + j * n) < n) {
                    f += (10 - Math.abs(j) - (i < 2));
                }
            }
            sum += f * (10 - i % 2 * 9);
        }
        System.out.println(sum);
    }
}