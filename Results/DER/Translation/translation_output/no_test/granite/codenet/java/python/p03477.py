System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt() + sc.nextInt();
        int right = sc.nextInt() + sc.nextInt();
        if(left > right) {
            System.out.print("Left");
        } else if (left == right) {
            System.out.print("Balanced");
        } else {
            System.out.print("Right");
        }
    }
}

```


Answer:
```python
import sys

left = sum(map(int, sys.stdin.readline().split()))
right = sum(map(int, sys.stdin.readline().split()))

if left > right:
    print("Left")
elif left == right:
    print("Balanced")
else:
    print("Right")
```<|endoftext|>
