import java.util.Scanner;

public class p03840 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int O = scanner.nextInt();
        int T = scanner.nextInt();
        int J = scanner.nextInt();
        int L = scanner.nextInt();
        int S = scanner.nextInt();
        int Z = scanner.nextInt();
        scanner.close();

        int a;
        if (I > 0 && J > 0 && L > 0) {
            a = ((I - 1) / 2 + (J - 1) / 2 + (L - 1) / 2) * 2 + 3 + O;
        } else {
            a = 0;
        }
        int b = ((I / 2 + J / 2 + L / 2) * 2 + O);
        int ans = Math.max(a, b);
        System.out.println(ans);
    }
}