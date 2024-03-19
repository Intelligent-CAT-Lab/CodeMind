<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 10000

Expected output:
96

```
import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = scan.nextInt();
        printIsland(n, count);
    }

    public static void printIsland(int n, int count) {
        int a = (n + 1) / 2;
        int b = n / 2;
        int max = a * a + b * b;
        if (count > max) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0 && count > 0) {
                    sb.append('L');
                    count--;
                } else {
                    sb.append('S');
                }
            }
            sb.append("\n");
        }
    }
}
```

### Response:
```python
def printIsland(n, count):
    a = (n + 1) // 2
    b = n // 2
    max = a * a + b * b
    if count > max:
        print("NO")
        return
    print("YES")
    for i in range(n):
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                print('L', end='')
                count -= 1
            else:
                print('S', end='')
        print()

n, count = map(int, input().split())
printIsland(n, count)
```

This Python code does the same thing as the Java code. It reads two integers from the input, calls the `printIsland` function with these integers, and prints the result. The `printIsland` function generates a grid of size `n` x `n`, with 'L's and 'S's alternating in a checkerboard pattern. If the number of 'L's requested is more than possible, it prints "NO". Otherwise, it prints "YES" and the grid.
<|EOT|>
