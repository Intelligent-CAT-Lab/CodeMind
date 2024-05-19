System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 17

Expected output:
21

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


Answer:
```python
x, t = map(int, input().split())
if x > t:
    print(x - t)
else:
    print(0)
```

Test input:
```
100 17
```

Expected output:
```
21
```<|endoftext|>
