<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
Hello World


```
import java.util.*;

public class p03238{
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		if(n == 1)System.out.println("Hello World");
		else {
			int a = fs.nextInt(),b = fs.nextInt();
			System.out.println(a+b);
		}
		fs.close();
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

n = int(sys.stdin.readline())
if n == 1:
    print("Hello World")
else:
    a, b = map(int, sys.stdin.readline().split())
    print(a+b)
```

'''
<|endoftext|>
