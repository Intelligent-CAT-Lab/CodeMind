import java.util.Scanner;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();  // Close the scanner as it's no longer needed.
        int c = 0;

        for (int i = 0; i < 2; i++) {
            c += Math.max(a, b);
            if (a >= b) {
                a -= 1;
            } else {
                b -= 1;
            }
        }

        System.out.println(c);
    }
}