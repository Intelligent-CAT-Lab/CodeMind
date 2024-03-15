import java.util.Scanner;

public class codeforces_306_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
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
            System.out.print(a[i] + " ▁ ");
        }
        input.close();
    }
}