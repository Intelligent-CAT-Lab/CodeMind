<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        System.out.println(main(N, d, x));
    }

    public static double main(int N, int d, int x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (int)(d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N -= 1;
        }
        return ret;
    }
}
```

This Java code reads three integers from the standard input, and then calls the `main` function with these integers. The `main` function calculates and returns a double value, which is then printed to the standard output.
<|EOT|>
