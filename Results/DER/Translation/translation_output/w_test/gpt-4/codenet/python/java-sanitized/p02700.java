import java.util.Scanner;

public class p02700 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        boolean outcome = false; // Indicates if an outcome has been reached

        while (A > 0 && C > 0) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                outcome = true;
                break;
            }
            A -= D;
            if (A <= 0) {
                System.out.println("No");
                outcome = true;
                break;
            }
        }

        // Just in case there is no outcome, though the logic should always produce one
        if (!outcome) {
            System.out.println("Draw");
        }

        scanner.close();
    }
}