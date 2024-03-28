import java.util.Scanner;

public class p03644 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Read the input

        int ans = 1, k = 0;
        for (int i = 2; i <= N; i += 2) {
            int temp = i, res = 0;
            while (temp % 2 == 0) {
                res += 1;
                temp /= 2;
            }
            if (k < res) {
                ans = i;
                k = res;
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}