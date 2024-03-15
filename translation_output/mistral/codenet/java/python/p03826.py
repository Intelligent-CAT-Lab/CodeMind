<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03826 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt(),b=sc.nextInt()*sc.nextInt();
		System.out.println((a<b)?b:a);
		sc.close();
	}
}
```
[/INST]
```python
import sys

a, b = map(int, input().split())
print(max(a, b))
```</s>
