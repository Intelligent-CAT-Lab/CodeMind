System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03129 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if((sc.nextInt() + 1) / 2 >= sc.nextInt()) System.out.println("YES");
        else System.out.println("NO");
    }

}



```


Answer:
```python
import sys

if (int(sys.stdin.readline()) + 1) // 2 >= int(sys.stdin.readline()):
    print("YES")
else:
    print("NO")
```<|endoftext|>
