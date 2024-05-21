import java.util.Scanner;

public class p02842 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[50000];
        for (int i = 0; i < 50000; i++) {
            prices[i] = (int) (1.08 * i);
        }
        for (int i = 0; i < 50000; i++) {
            if (prices[i] == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }
}