import java.util.Scanner;

public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println((a + b) % 24);
        
        scanner.close();
    }
}