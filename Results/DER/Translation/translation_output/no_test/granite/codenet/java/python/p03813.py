System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}
```


Answer:
```python
import sys

if __name__ == "__main__":
    x = int(sys.stdin.read())
    print("ABC" if x < 1200 else "ARC")
```<|endoftext|>
