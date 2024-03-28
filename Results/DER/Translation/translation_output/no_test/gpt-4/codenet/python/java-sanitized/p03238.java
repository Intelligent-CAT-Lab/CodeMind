import java.util.Scanner;

public class p03238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        if (n == 1) {
            System.out.println("Hello World");
            System.exit(0);
        }
        
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(a + b);
        
        scanner.close();
    }
}