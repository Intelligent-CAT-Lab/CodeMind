<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3

Expected output:
Yes

```
import java.util.*;
public class p02789{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    if (n==m) {
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
 
  }
}
```

@@ Response
```python
# Python code

# Get input from user
n, m = map(int, input().split())

# Compare the numbers
if n == m:
    print("Yes")
else:
    print("No")
```

Test input:
3 3

Expected output:
Yes<｜end▁of▁sentence｜>
