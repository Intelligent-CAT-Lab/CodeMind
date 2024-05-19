System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02963{
	public static void main(String[]i){
		long s=Long.parseLong(new Scanner(System.in).next());
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}

```


Answer:
```python
import sys

s = int(sys.stdin.read())
a = 1000000000
print("0 0 {} 1 {} {}".format(a, (a - s % a) % a, (s - 1) // a + 1))
```<|endoftext|>
