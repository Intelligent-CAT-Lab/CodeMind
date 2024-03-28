```java
import java.util.Scanner;

public class Main {
    
    public static boolean isPrime(int x) {
        for (int i = 7; i <= Math.sqrt(x) + 1; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        String s = "9".repeat(n);
        
        if (c < 0) {
            return (n > 1) ? Integer.parseInt("11" + s + s) : 0;
        }
        
        for (char h : "9731".toCharArray()) {
            if (n - 1 > 0) {
                for (int m = (int)Math.pow(10, n - 1) - 1; m > 0; m--) {
                    String mStr = Integer.toString(m - 1);
                    int sum = 0;
                    for (char k : (h + mStr).toCharArray()) {
                        sum += Character.getNumericValue(k);
                    }
                    if ((sum * 2 + c) % 3 != 0) {
                        String t = h + mStr;
                        t = t + "0".repeat(n - 1 - t.length());
                        int a = Integer.parseInt(t + c + new StringBuilder(t).reverse());
                        if (isPrime(a)) {
                            return a;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(h + c + h);
                if (isPrime(a)) {
                    return a;
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int result = solve();
        System.out.println(result);
    }
}
```
