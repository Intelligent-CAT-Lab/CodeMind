System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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
import sys

string = sys.stdin.readline().strip()
tString = sys.stdin.readline().strip()
print(tString + string)
```<|endoftext|>
