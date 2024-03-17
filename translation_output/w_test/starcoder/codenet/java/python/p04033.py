<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
Positive


```
import java.util.Scanner;

public class p04033 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int a=s.nextInt(),b=s.nextInt();
		if(a<=0&&0<=b)
			System.out.println("Zero");
		else
			System.out.println((Math.min(0,b)-Math.min(-1,a))%2==1?"Positive":"Negative");
	}
}

```

python code:<fim_suffix><fim_middle>

```python
a,b=map(int,input().split())
if a<=0 and b>=0:
	print("Zero")
else:
	print("Positive" if (min(0,b)-min(-1,a))%2==1 else "Negative")
```
<|endoftext|>
