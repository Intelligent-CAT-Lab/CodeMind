import java.util.Scanner;

public class p03623 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input from user
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        // Calculating which point is closer and printing result
        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}