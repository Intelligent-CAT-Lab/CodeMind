import java.util.Scanner;

public class p03131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (B - A <= 2) {
            System.out.println(K + 1);
        } else {
            int first_num_exchanges = A + 1;
            int rest_num_exchanges = K - first_num_exchanges;
            int gain_per_two_manipulation = B - A;
            int num_cookies = rest_num_exchanges / 2 * gain_per_two_manipulation + B;
            if (rest_num_exchanges % 2 == 1) {
                num_cookies += 1;
            }
            System.out.println(num_cookies);
        }
    }
}