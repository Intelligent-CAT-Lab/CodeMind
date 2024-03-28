Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = (int) (d + (d / N) + (5 * x) / (2 * N));
            x += 2 * x / N;
            N--;
        }

        bw.write(String.format("%.10f", ret));
        bw.flush();
    }
}
```<|endoftext|>
