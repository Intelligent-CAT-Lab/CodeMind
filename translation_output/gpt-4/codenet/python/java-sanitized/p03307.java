import java.util.Scanner;

public class p03307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(2 * n);
        }
        
        scanner.close();
    }
}