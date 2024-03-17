<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
3


```
import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

x = int(sys.stdin.readline())
i = 1
while i * (i + 1) / 2 < x:
    i += 1
print(i)
```
"""
<|endoftext|>
