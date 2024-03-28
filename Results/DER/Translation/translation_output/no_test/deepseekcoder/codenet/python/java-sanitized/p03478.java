import java.util.Scanner;

public class p03478 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int n_i = 1; n_i <= n; n_i++) {
            int n_orders_sum = 0;
            for (char n_order_i : Integer.toString(n_i).toCharArray()) {
                n_orders_sum += Character.getNumericValue(n_order_i);
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += n_i;
            }
        }
        System.out.println(sum);
    }
}