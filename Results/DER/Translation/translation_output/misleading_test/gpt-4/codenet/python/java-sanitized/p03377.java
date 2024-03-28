import java.util.Scanner;

public class p03377 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read space-separated integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        
        // Check the condition and print "YE" or "NO"
        System.out.println((a <= x && a + b >= x) ? "YE" : "NO");
        
        scanner.close();
    }
}