import java.util.Scanner;

public class p02336 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        if (k > n) {
            System.out.println(0);
            return;
        }

        int ans = 1;
        for (int i = 1; i < k; i++) {
            ans *= n - i;
            ans /= i;
            ans %= 1000000007;
        }

        System.out.println(ans);
        scanner.close();
    }
}