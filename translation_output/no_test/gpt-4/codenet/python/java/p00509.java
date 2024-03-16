Here is the Python code translated to Java:

```java
import java.util.Scanner;

public class PalindromePrimeFinder {

    public static void main(String[] args) {
        System.out.println(f());
    }

    public static boolean isPrime(long x) {
        if(x < 2) return false;
        if(x == 2 || x == 3) return true;
        if(x % 2 == 0 || x % 3 == 0) return false;
        for (long i = 7; i <= Math.sqrt(x); i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long f() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            return n > 1 ? Long.parseLong(s + s) : 11;
        }

        String digits = "9731";
        for (int i = 0; i < digits.length(); ++i) {
            char h = digits.charAt(i);
            if (n - 1 > 0) {
                for (long m = (long) Math.pow(10, n - 1) - 1; m > 0; --m) {
                    String mStr = Long.toString(m - 1);
                    if ((getDigitSum(h + mStr) * 2 + c) % 3 != 0) {
                        String t = h + String.format("%" + (n - 1) + "s", mStr).replace(' ', '0');
                        long a = Long.parseLong(t + c + new StringBuilder(t).reverse());
                        if (isPrime(a)) {
                            return a;
                        }
                    }
                }
            } else {
                long a = Long.parseLong(h + "" + c + h);
                if (isPrime(a)) {
                    return a;
                }
            }
        }
        scanner.close();
        return -1; // This line will only be reached if no palindrome prime is found
    }

    public static int getDigitSum(String num){
        int sum = 0;
        for (char digit : num.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }
}
```

Note:

1. I've added a helper method `isPrime()` that checks if a given number `x` is a prime number.
2. The `f()` function uses a `Scanner` to read the two integer inputs `n` and `c`.
3. A small change is made in the way the repeated `9` string `s` is created to conform to Java syntax.
4. The logic handling the decrement of `m` and padding of zeroes is adjusted for Java's syntax.
5. Java's `StringBuilder` is used to reverse the string `t`.
6. A helper method `getDigitSum()` is added to calculate the sum of digits in a string representing a number. This replaces the inline `sum(int(k) for k in h+m)` from Python.
7. Handling of scenario when no palindrome prime is found by returning `-1`.
8. I've assumed that the `Scanner` being used is for a one-time input and thus added a call to close it, which is considered good practice to release system resources. If you're using it multiple times or in a loop, you might need to adjust the code accordingly.
