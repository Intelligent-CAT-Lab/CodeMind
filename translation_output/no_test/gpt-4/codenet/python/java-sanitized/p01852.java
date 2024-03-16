import java.util.Scanner;

public class p01852 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Close the scanner to avoid resource leaks (optional but recommended)
        scanner.close();  
        System.out.println(n != 0 ? Integer.toBinaryString(n).length() : 0);
    }
}