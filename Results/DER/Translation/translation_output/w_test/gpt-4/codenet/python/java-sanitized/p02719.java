import java.util.Scanner;

public class p02719 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int n = inputScanner.nextInt();
        int k = inputScanner.nextInt();
        
        int rot = n / k;
        int x = n;
        
        if (k == 1 || n == k || n % k == 0) {
            x = 0;
        } else if (rot >= 1) {
            x = n - k * rot;
        }
        
        int t = x % k;
        
        System.out.println(Math.min(t, Math.abs(t - k)));
        
        inputScanner.close();
    }
}