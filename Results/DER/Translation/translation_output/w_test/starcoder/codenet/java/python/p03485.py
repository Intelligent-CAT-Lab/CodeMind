<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def solve(a, b):
    return (a + b + 1) / 2

if __name__ == "__main__":
    a, b = map(int, sys.stdin.readline().split())
    print(solve(a, b))
```

'''
<|endoftext|>
