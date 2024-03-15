Here's the equivalent Java code for the provided Python code snippet:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int n2 = N;
        int n1 = N;
        int m1 = M;
        int mall = M * 2;

        // Translate "うくをほろぼす"
        int ans1 = 0;
        while (true) {
            mall -= n1;
            m1 = (int)Math.ceil((double)mall / 2);

            if (mall <= 0) {
                break;
            }
            ans1++;

            if (n2 - m1 >= 0) {
                n2 -= m1;
            } else {
                n1 = n1 + n2 - m1;
                n2 = 0;
            }
            if (n1 <= 0) {
                break;
            }
            ans1++;
        }

        // Translate "ushiを滅ぼす"
        int ans2 = 0;
        n2 = N;
        n1 = N;
        m1 = M;
        int m2 = M;
        mall = M * 2;
        int nall = N * 2;

        while (true) {
            if (m2 - n1 >= 0) {
                m2 -= n1;
            } else {
                m1 = m1 + m2 - n1;
                m2 = 0;
            }
            if (m1 <= 0) {
                break;
            }
            ans2++;

            nall -= m1;
            n1 = (int)Math.ceil((double)nall / 2);

            if (nall <= 0) {
                break;
            }
            ans2++;
        }

        System.out.println(Math.min(ans1, ans2));
        sc.close();
    }
}
```

A few notes on the translation:

1. Java lacks a built-in equivalent to Python's `input().split()`, so `Scanner` is used for reading input. 
2. In Python, `n1 = -(-mall//2)` is a way to achieve a ceiling division to avoid fractions. In Java, the equivalent is `(int)Math.ceil((double)mall / 2)`.
3. In the condition, `if mall <= 0:` Python accepts an integer comparison with `<=`, in Java, it is the same.
4. The `print` function in Python is replaced with `System.out.println` in Java.
5. Java is strictly typed, so all variables must have a type declared, and explicit type casting is used when necessary, such as after performing division and wanting to keep the result as an integer.
6. In Java, the class and method must be defined, so all of this code goes within a `main` method of a `Main` class.
7. At the end of input scanning, `sc.close();` is added to close the `Scanner` object to prevent resource leaks.

