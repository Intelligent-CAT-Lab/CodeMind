<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

K = int(input())
a = 0
d = 1
def snuke(x):
    a = 0
    while x>0:
        a += x%10
        x //= 10
    return a
for i in range(1, K+1):
    x = a + d
    y = a + 10*d
    if x/snuke(x) <= y/snuke(y):
        a = x
    else:
        a = y
        d *= 10
    print(a)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int a = 0;
        int d = 1;

        for (int i = 1; i <= K; i++) {
            int x = a + d;
            int y = a + 10 * d;
            if (x / snuke(x) <= y / snuke(y)) {
                a = x;
            } else {
                a = y;
                d *= 10;
            }
            System.out.println(a);
        }
    }

    public static int snuke(int x) {
        int a = 0;
        while (x > 0) {
            a += x % 10;
            x /= 10;
        }
        return a;
    }
}
```
Note that I have added a `snuke` method to calculate the sum of the digits of a number. This method is called in the `main` method to calculate the values of `x` and `y`.</s>
