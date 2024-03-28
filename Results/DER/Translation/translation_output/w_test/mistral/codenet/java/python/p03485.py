<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
2


```
import java.util.Scanner;

public class p03485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solve(a, b));

        sc.close();
    }

    static int solve(int a, int b) {
        return (a + b + 1) / 2;
    }
}
```
[/INST]
```python
# Test input:
a = int(input())
b = int(input())

# Expected output:
print(solve(a, b))

def solve(a, b):
    return (a + b + 1) // 2
```</s>
