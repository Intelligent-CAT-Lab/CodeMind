import java.util.Scanner;

public class p03478 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int n_orders_sum = 0;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                n_orders_sum += Integer.parseInt(String.valueOf(i).charAt(j));
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}