import java.util.Scanner;

public class p03840 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int J = scanner.nextInt();
        int L = scanner.nextInt();
        int O = scanner.nextInt();

        if (I != 0 && J != 0 && L != 0) {
            int a = ((I - 1) / 2 + (J - 1) / 2 + (L - 1) / 2) * 2 + 3 + O;
        } else {
            int a = 0;
        }

        int b = (I / 2 + J / 2 + L / 2) * 2 + O;
        int ans = Math.max(a, b);
        System.out.println(ans);
    }
}