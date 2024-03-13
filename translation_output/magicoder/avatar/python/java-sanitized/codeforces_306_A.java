import java.util.Scanner;

public class codeforces_306_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int q = n / m;
        int r = n % m;
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = q;
        }
        for (int i = 0; i < r; i++) {
            a[i] += 1;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }
}