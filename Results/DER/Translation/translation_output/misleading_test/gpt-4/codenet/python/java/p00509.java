Here's the translated Java code for the provided Python code:

```java
import java.util.Scanner;

public class FancyPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int n = Integer.parseInt(parts[0]);
        int c = Integer.parseInt(parts[1]);
        System.out.println(f(n, c));
        scanner.close();
    }
    
    static boolean p(int x) {
        for (int i = 7; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
    
    static int f(int n, int c) {
        String s = "9".repeat(n);
        if (c < 0) return n > 1 ? 11 : Integer.parseInt(s+s);
        String hValues = "9731";
        for (int h = 0; h < hValues.length(); h++) {
            char hc = hValues.charAt(h);
            if (n - 1 > 0) {
                for (int m = (int)Math.pow(10, n-1) - 1; m > 0; m--) {
                    String mStr = String.valueOf(m - 1);
                    if ((getDigitSum(hc + mStr) * 2 + c) % 3 != 0) {
                        String t = hc + leftPadZeros(mStr, n - 1);
                        int a = Integer.parseInt(t + c + new StringBuilder(t).reverse().toString());
                        if (p(a)) return a;
                    }
                }
            } else {
                int a = Integer.parseInt(hc + c + hc);
                if (p(a)) return a;
            }
        }
        return -1; // To indicate no result, it should never reach here for valid inputs.
    }
    
    static String leftPadZeros(String s, int n) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() < n - s.length()) {
            sb.append('0');
        }
        sb.append(s);
        return sb.toString();
    }
    
    static int getDigitSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }
}
```

Please note that in Java, it's necessary to wrap the program in a class (in this case `FancyPalindrome`), and I adjusted the input mechanism to use the `Scanner` class for console input. Moreover, since we're not using Lists and other Python-specific data types, I replaced some parts with their Java equivalents, such as using `StringBuilder`. Some functions are also split into new functions like `getDigitSum` and `leftPadZeros` for better code organization and readability.
