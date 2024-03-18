import java.util.Scanner;

public class codeforces_669_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        
        if (n % 3 == 0) {
            System.out.println(n / 3 * 2);
        } else if (n < 3) {
            System.out.println(1);
        } else {
            System.out.println(n / 3 * 2 + 1);
        }
        
        scanner.close();
    }
}