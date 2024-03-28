<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 2 7

Expected output:
15


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

python code:<fim_suffix><fim_middle>

```python
import sys
a,b=map(int,sys.stdin.readline().split())
print(min(a*b,b*a))
```
<|endoftext|>
