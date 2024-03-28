import java.util.Scanner;

public class p02389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println(a * b + " " + (a + b) * 2);
        
        scanner.close();
    }
}