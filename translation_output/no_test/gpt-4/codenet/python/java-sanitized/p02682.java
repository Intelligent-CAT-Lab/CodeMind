import java.util.Scanner;

public class p02682 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        
        int minA = Math.min(a, k);
        ans += 1 * minA;
        k -= minA;

        int minB = Math.min(b, k);
        // ans += 0 * minB; // This line can be omitted since it does not change the ans value.
        k -= minB;

        int minC = Math.min(c, k);
        ans += (-1) * minC;
        k -= minC;

        System.out.println(ans);
        
        scanner.close();
    }
}