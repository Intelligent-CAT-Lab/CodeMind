<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
0


```
import java.util.Scanner;

public class p03417 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long M = sc.nextLong();

        System.out.println(Math.abs((N-2) * (M-2)));
    }
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

N, M = map(int, sys.stdin.readline().split())

print(abs((N-2) * (M-2)))
```
<|endoftext|>
