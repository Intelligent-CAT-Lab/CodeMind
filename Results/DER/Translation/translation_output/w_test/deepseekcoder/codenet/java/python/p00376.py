<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def p00376():
    a, b = map(int, input().split())
    ans = abs(a - b)
    print(ans)

p00376()
```
<|EOT|>
