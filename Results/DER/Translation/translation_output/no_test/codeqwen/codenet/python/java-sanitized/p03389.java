import java.util.Arrays;
import java.util.Scanner;

public class p03389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        int[] a = {A, B, C};
        Arrays.sort(a);
        int s = 0;

        for (int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];

            s += tmp / 2;
            a[i] += tmp / 2 * 2;
        }

        s += Arrays.stream(a).sum() % 3;

        System.out.println(s);
    }
}