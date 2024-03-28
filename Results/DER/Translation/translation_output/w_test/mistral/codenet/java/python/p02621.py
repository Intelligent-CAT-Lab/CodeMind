<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
a = int(input())
print(a + a**2 + a**3)
```</s>
