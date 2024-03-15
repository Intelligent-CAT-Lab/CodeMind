import java.util.Scanner;

public class p03023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of sides of the polygon: ");
        int n = scanner.nextInt();
        int s = 180 * (n - 2);
        
        System.out.println(s);
        
        scanner.close();
    }
}