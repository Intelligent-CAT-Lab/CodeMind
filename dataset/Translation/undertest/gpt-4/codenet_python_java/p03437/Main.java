import java.util.Scanner;

public class p03437 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reads two integers separated by space
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        // Prints x if x is divisible by y, otherwise prints -1
        System.out.println(x % y == 0 ? -1 : x * 2);
        
        scanner.close();
    }
}