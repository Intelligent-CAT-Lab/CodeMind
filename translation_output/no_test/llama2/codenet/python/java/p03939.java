<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### Input

- The first line contains three integers, $N$, $d$, and $x$.
- The second line contains a single integer, $T$, the number of test cases.
- Each of the next $T$ lines contains three integers, $N$, $d$, and $x$.

### Output

- For each test case, output a single line containing the answer to the problem.

### Constraints

- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- $1 \leq d \leq 10^5$
- $1 \leq x \leq 10^5$

### Hint

- Use the `Scanner` class to read input.
- Use the `PrintWriter` class to write output.
- Use the `System.out` class to print output.
- Use the `System.in` class to read input.
- Use the `System.err` class to print error messages.
- Use the `System.exit` class to terminate the program.
- Use the `System.getProperty` class to get system properties.
- Use the `System.getenv` class to get environment variables.
- Use the `System.load` class to load a class.
- Use the `System.setProperty` class to set system properties.
- Use the `System.setenv` class to set environment variables.
- Use the `System.out.println` class to print output.
- Use the `System.err.println` class to print error messages.
- Use the `System.out.print` class to print output.
- Use the `System.err.print` class to print error messages.
- Use the `System.out.flush` class to flush output.
- Use the `System.err.flush` class to flush error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format error messages.
- Use the `System.out.printf` class to format output.
- Use the `System.err.printf` class to format error messages.
- Use the `System.out.format` class to format output.
- Use the `System.err.format` class to format
