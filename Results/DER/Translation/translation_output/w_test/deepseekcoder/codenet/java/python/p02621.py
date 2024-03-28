<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
14


```
import java.util.Scanner;
public class p02621
{
	public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int a  = sc.nextInt();
      System.out.println(a + (a*a) + (a*a*a));
    }
      
}    

```

### Response:
```python
a = int(input())
print(a + (a*a) + (a*a*a))
```
<|EOT|>
