import java.util.Scanner;

public class p02702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int[] remain = new int[2020];
        int now = 0;
        long ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += Integer.parseInt(String.valueOf(s.charAt(i))) * pow(10, s.length() - i - 1, 2019);
            ans += remain[now % 2019];
            remain[now % 2019]++;
        }
        
        ans += remain[0];
        System.out.println(ans);
    }
    
    public static int pow(int base, int exp, int mod) {
        int result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}