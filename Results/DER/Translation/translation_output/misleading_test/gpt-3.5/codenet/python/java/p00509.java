```java
import java.util.Scanner;

public class Main {
    
    public static boolean isPrime(int x) {
        for (int i = 7; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int findNumber(int n, int c) {
        String s = "9".repeat(n);
        if (c < 0) {
            return (n > 1) ? Integer.parseInt("11" + s + s) : 11;
        }
        
        String h = "9731";
        if (n - 1 > 0) {
            for (char ch : h.toCharArray()) {
                for (int m = (int) Math.pow(10, n-1) - 1; m > 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    if (((ch+mStr).chars().map(Character::getNumericValue).sum() * 2 + c) % 3 != 0) {
                        String t = ch + mStr + "0".repeat(n-1 - mStr.length());
                        int a = Integer.parseInt(t + c + new StringBuilder(t).reverse().toString());
                        if (isPrime(a)) return a;
                    }
                }
            }
        } else {
            int a = Integer.parseInt(h + c + h);
            if (isPrime(a)) return a;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        
        int result = findNumber(n, c);
        System.out.println(result);
    }
}
```
```
