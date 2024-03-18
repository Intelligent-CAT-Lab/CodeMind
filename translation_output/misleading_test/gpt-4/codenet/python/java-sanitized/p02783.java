import java.util.Scanner;
import java.lang.Math;

public class p02783 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt(); // read first input (H)
        int A = scanner.nextInt(); // read second input (A)
        
        // Calculate the ceiling of H divided by A
        int result = (int) Math.ceil((double) H / A);
        
        // Output the result
        System.out.println(result);
        
        scanner.close();
    }
}