import java.util.Scanner;

public class p02957 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        scanner.close();

        if (A == B) {
            System.out.println("IMPOSSIBLE");
        } else {
            double x = (Math.pow(A, 2) - Math.pow(B, 2)) / (2.0 * (A - B));
            if (x % 1 == 0) {
                System.out.println((int) x);
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}