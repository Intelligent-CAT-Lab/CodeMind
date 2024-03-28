Here's the translated Java code from the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int[] remain = new int[2020];
        int now = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now = (now + ((s.charAt(i) - '0') * powMod(10, s.length() - i - 1, 2019))) % 2019;
            ans += remain[now];
            remain[now]++;
        }
        
        ans += remain[0];
        
        System.out.println(ans);
        scanner.close();
    }

    // Calculates (base^exp) % mod using a method that prevents overflow for large exponents
    private static int powMod(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            exp >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}
```

Several things to note here:
- We need to import `java.util.Scanner` to read input from the user.
- There's no direct correlation between Python's `pow` function with third argument (which allows for modulo operation) and Java's built-in methods. So, a custom `powMod` method is created to handle modular exponentiation.
- Arrays in Java are typed, so we use `int[]` for `remain`.
- In Python, you can multiply strings by an integer to repeat them, which is not possible in Java. Hence, the conversion from character to integer and the calculation of the power of 10 mod 2019 is done within the loop. 
- Since Java does not have implicit conversion from `char` to `int` the way Python does, the expression `(s.charAt(i) - '0')` is used to convert a numeric character to its integer value.
- We use `System.out.println(ans);` to print the result to the standard output.
- It's also good practice in Java to close the `Scanner` to release system resources associated with it after it's no longer needed, hence the `scanner.close();` line at the end of the `main` method.
