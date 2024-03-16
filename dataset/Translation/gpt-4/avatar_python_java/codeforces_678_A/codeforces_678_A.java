import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integer values from the user
        int vamshi = scanner.nextInt();
        int z = scanner.nextInt();

        // Calculating and printing the result
        System.out.println((vamshi / z + 1) * z);
        
        scanner.close();
    }
}