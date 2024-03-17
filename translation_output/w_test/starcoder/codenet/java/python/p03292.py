<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 6 3

Expected output:
5


```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class p03292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R = sc.nextInt();
        int Y = sc.nextInt();

        int A = Math.max(Math.max(T,R),Y);
        int B = Math.min(Math.min(T,R),Y);

        System.out.println(A-B);
    }
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

T = int(sys.stdin.readline())
R = int(sys.stdin.readline())
Y = int(sys.stdin.readline())

A = max(max(T,R),Y)
B = min(min(T,R),Y)

print(A-B)
```
<|endoftext|>
