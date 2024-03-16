import java.util.Scanner;
import java.lang.Math;

public class p02881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[2];
        for (int i = n; i > 1; i--) {
            if (n % i == 0 && n / i == n / (i * i)) {
                result[0] = i;
                result[1] = n / i;
                break;
            }
        }

        System.out.println(result[0] + result[1] - 2);
    }
}