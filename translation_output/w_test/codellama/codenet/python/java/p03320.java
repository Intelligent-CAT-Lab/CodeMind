<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1
2
3
4
5
6
7
8
9
19


```
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

```
[/INST]
```
import java.util.Scanner;

public class Solution {
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
This is the Java code for the given Python code. The `snuke` function is defined as a separate method in Java, and the `main` method is used to read the input from the user and print the output. The `for` loop is used to iterate over the range of numbers from 1 to K, and the `if` statement is used to determine whether the current number is a valid solution. If it is, the `a` variable is updated to the current number, and the `d` variable is updated to 10 times its current value. If the current number is not a valid solution, the `a` variable is updated to the previous number, and the `d` variable is not updated. Finally, the `a` variable is printed to the console.</s>
