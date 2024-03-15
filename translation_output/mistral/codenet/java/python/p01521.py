<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

c = sys.stdin.readline().strip()
print("x" in c and "x" in c[-1] ? "x" : "o")
```</s>
