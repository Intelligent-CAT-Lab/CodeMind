import java.util.Scanner;

public class p03840 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int O = scanner.nextInt();
        int T = scanner.nextInt(); // not used in the code logic
        int J = scanner.nextInt();
        int L = scanner.nextInt();
        int S = scanner.nextInt(); // not used in the code logic
        int Z = scanner.nextInt(); // not used in the code logic

        int a = 0;
        if (I > 0 && J > 0 && L > 0) {
            a = ((I - 1) / 2 + (J - 1) / 2 + (L - 1) / 2) * 2 + 3 + O;
        }
        int b = (I / 2 + J / 2 + L / 2) * 2 + O;
        int ans = Math.max(a, b);

        System.out.println(ans);

        scanner.close();
    }
}