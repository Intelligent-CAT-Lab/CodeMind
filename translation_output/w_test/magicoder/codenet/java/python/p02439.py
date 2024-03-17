<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5 3

Expected output:
3 5


```
import java.util.*;
public class p02439 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println(Math.min(min,c)+" "+Math.max(max,c));
    }
}

```

@@ Response
```python
# Python code

# Read input from user
a, b, c = map(int, input().split())

# Find minimum and maximum of a and b
min_ab = min(a, b)
max_ab = max(a, b)

# Print the minimum and maximum of min_ab and c and max_ab and c
print(min(min_ab, c), max(max_ab, c))
```

Test input:
4 5 3

Expected output:
3 5<｜end▁of▁sentence｜>
