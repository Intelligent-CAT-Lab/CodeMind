import java.util.Arrays;
import java.util.Scanner;

public class p00341 {
    public static void main(String[] args) {
        int[] a = new int[100];
        Arrays.fill(a, 0);
        Scanner scanner = new Scanner(System.in);
        String[] b = scanner.nextLine().split(" ");
        for (int i = 0; i < 12; i++) {
            a[Integer.parseInt(b[i]) - 1] += 1;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println(c == 3 ? "yes" : "no");
    }
}