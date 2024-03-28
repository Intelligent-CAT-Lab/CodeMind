import java.util.Scanner;

public class p02717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read space-separated integers
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        // Swap the values
        int A = Z;
        int B = X;
        int C = Y;

        // Print the result
        System.out.println(A + " " + B + " " + C);
        
        scanner.close();
    }
}