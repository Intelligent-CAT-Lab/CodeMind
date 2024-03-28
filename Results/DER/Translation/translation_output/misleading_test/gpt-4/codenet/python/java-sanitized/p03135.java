import java.util.Scanner;

public class p03135 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close(); // Close the scanner after input
        
        System.out.println((double) t / x);
    }
}

// How to use:
//