<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxxoxoo

Expected output:
o


```
import java.util.Scanner;
public class p01521
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		char c[]=in.next().toCharArray();
		System.out.println(c[0]=='x'&&c[c.length-1]=='x' ? "x":"o");
	}
}
```
[/INST]
```python
# Sample test case
input = "oxxoxoo"

# Expected output
output = "o"

# Python code
c = input[0] == 'x' and input[-1] == 'x'
print(c)
```</s>
