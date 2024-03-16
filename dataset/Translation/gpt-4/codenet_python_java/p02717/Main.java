import java.util.Scanner;

public class p02717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading space-separated integers from the user input
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        // Initial assignments
        int A = X;
        int B = Y;
        int C = Z;

        // Swapping the variable values
        B = X;
        C = Y;
        A = Z;

        // Printing out the results
        System.out.println(A + " " + B + " " + C);

        scanner.close();
    }
}