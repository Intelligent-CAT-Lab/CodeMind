System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oder atc

Expected output:
_atcoder

```
import java.util.Scanner;

public class p02817 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		String tString = in.next();
		System.out.println(tString + string);
		in.close();
	}
}
```


Answer:
```python
string = input()
tString = input()
print(tString + string)
```

Test input:
```
oder atc
```

Expected output:
```
_atcoder
```<|endoftext|>
