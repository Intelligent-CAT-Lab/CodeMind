<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11

Expected output:
82

```
import java.util.*;

public class p02952
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(String.valueOf(i).length()%2 != 0)
			{c++;}
		}
		System.out.println(c);
	}
}
```
[/INST]
```python
a = int(input())
c = 0
for i in range(1, a+1):
    if len(str(i)) % 2 != 0:
        c += 1
print(c)
```</s>
