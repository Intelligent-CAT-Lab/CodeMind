import java.util.Scanner;

public class p03947 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ans = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                ans += 1;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}