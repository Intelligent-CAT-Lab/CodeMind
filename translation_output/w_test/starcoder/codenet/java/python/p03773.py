<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9 12

Expected output:
21


```
import java.util.Scanner;
public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = A + B > 23? A + B - 24 : A + B;
        System.out.println(ans);
    }
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

A, B = map(int, sys.stdin.readline().split())

if A + B > 23:
    print(A + B - 24)
else:
    print(A + B)

```
<|endoftext|>
