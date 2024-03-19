<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 3

Expected output:
12.389552719678193

```
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N, d, x = map(int, read().split())

def main(N, d, x):
    ret = 0
    while N:
        ret += d + (N-0.5) * x
        d = d + (d/N) + (5*x)/(2*N)
        x += 2*x/N
        N -= 1
    return ret

print(main(N, d, x))
```
[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d += (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }
        System.out.println(ret);
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read the input from the user and the `System.out.println()` method to print the result.

Note that the `read()` method in Python is replaced by the `nextInt()` method in Java, which reads the next integer from the input stream. Similarly, the `readline()` method in Python is replaced by the `nextLine()` method in Java, which reads the next line from the input stream.

Also, note that the `map()` function in Python is not needed in Java, as the `Scanner` class provides methods to read different types of data from the input stream.</s>
