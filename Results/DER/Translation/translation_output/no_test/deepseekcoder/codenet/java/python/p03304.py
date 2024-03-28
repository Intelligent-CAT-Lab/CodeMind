<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.PrintStream;
import java.util.Scanner;
public class p03304 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        
        long s = d == 0 ? n : ((n - d) * 2);
        so.println((double) s/n/n*(m-1));
    }
}
```

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline().strip())
    m = int(sys.stdin.readline().strip())
    d = int(sys.stdin.readline().strip())

    s = d if d == 0 else (n - d) * 2
    print(float(s)/n/n*(m-1))

if __name__ == "__main__":
    main()
```
<|EOT|>
