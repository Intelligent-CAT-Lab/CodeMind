<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def solve(a, b):
    return (a + b + 1) // 2

if __name__ == "__main__":
    a = int(input())
    b = int(input())
    print(solve(a, b))
```</s>
