import java.util.ArrayList;
import java.util.Scanner;

public class p03050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Reading the input
        int n = (int) Math.sqrt(N); // Calculating the square root
        
        ArrayList<Integer> plist = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist.add(i); // Add the divisor
                if (i != N / i) {
                    plist.add(N / i); // Add the quotient if it's different from the divisor
                }
            }
        }
        
        int ans = 0;
        for (int i = 0; i < plist.size(); i++) {
            int x = plist.get(i);
            int kari = N / x - 1;
            if (kari != 0) {
                int q = N / kari;
                int r = N % kari;
                if (q == r) {
                    ans += kari;
                }
            }
        }
        
        System.out.println(ans); // Print the answer
    }
}