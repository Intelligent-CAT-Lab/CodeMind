import java.util.Scanner;

public class p03106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        int[] res = new int[100];
        for (int i = 1; i <= 100; i++) {
            if (a % i == 0 && b % i == 0) {
                res[i] = i;
            }
        }

        Arrays.sort(res);
        System.out.println(res[k - 1]);
    }
}