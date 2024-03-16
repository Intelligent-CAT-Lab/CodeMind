import java.util.Scanner;

public class p03139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Calculating and printing the results
        System.out.print(Math.min(A, B) + " ");
        System.out.println(Math.max(A + B - N, 0));
        
        scanner.close();
    }
}