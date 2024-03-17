<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 30

Expected output:
10


```
import java.util.Scanner;

public class p00376
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        ans=Math.abs(a-b);

        System.out.println(ans);
    }
}

```

@@ Response
```python
# Python code

# Get input from user
a, b = map(int, input().split())

# Calculate absolute difference
ans = abs(a - b)

# Print the result
print(ans)
```

Sample test case:

Test input:
20 30

Expected output:
10<｜end▁of▁sentence｜>
