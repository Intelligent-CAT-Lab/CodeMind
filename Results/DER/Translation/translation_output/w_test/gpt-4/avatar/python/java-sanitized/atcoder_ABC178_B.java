import java.util.Scanner;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        
        long ans = Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d));
        System.out.println(ans);
        
        scanner.close();
    }
}