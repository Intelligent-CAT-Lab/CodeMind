import java.util.Scanner;

public class p02399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close(); // Close the scanner
        
        int division = a / b;
        int remainder = a % b;
        double divisionFloat = (double) a / b; // Cast to double for floating-point division
        
        System.out.printf("%d %d %.6f", division, remainder, divisionFloat);
    }
}