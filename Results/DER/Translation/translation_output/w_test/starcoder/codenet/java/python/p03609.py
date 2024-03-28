<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 17

Expected output:
83


```
import java.util.Scanner;

public class p03609 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),t=scan.nextInt();
		if(x>t) {
			System.out.println(x-t);
		}
		else if(x<=t) {
			System.out.println("0");
		}

	}

}
```

python code:<fim_suffix><fim_middle>

```python
x=int(input())
t=int(input())
if x>t:
	print(x-t)
elif x<=t:
	print(0)
```
<|endoftext|>
