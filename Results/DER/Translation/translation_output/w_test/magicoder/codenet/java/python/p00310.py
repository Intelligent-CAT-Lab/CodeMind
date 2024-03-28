<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 20

Expected output:
40


```
import java.util.*;

public class p00310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        System.out.println(p + m + c);
    }
}


```

@@ Response
```python
# Python code

# Get input from user
p, m, c = map(int, input().split())

# Print the sum of p, m, and c
print(p + m + c)
```

Test input:
10 10 20

Expected output:
40<｜end▁of▁sentence｜>
