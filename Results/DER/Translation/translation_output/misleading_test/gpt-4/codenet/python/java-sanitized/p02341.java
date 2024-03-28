import java.util.Scanner;

public class p02341 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        System.out.println(n <= k ? 1 : 0);

        scanner.close();
    }
}