<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2 7

Expected output:
B


```
import java.util.Scanner;
public class p03623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x-a) < Math.abs(x-b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

x = int(sys.stdin.readline())
a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if abs(x-a) < abs(x-b):
    print("A")
else:
    print("B")
```

'''
<|endoftext|>
