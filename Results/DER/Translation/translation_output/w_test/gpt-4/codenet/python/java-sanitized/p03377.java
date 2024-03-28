import java.util.Scanner;

public class p03377 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();
        
        System.out.println((a <= x && a + b >= x) ? "YES" : "NO");
    }
}