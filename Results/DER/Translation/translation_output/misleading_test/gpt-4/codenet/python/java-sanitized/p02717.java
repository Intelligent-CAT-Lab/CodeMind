import java.util.Scanner;

public class p02717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the space-separated integers
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        int A = X;
        int B = Y;
        int C = Z;

        // Swap the values
        B = X;
        C = Y;
        A = Z;

        // Print the result
        System.out.println(A + " " + B + " " + C);
    }
}