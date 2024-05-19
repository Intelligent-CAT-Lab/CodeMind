System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03740 {
    public static void main(String[] args) {
		try{
			Scanner sc  = new Scanner(System.in);
			System.out.println(Math.abs(sc.nextLong() - sc.nextLong()) <= 1? "Brown" : "Alice");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
```


Answer:
```python
import sys

try:
    a, b = map(int, sys.stdin.readline().split())
    print("Brown" if abs(a - b) <= 1 else "Alice")
except:
    pass
```<|endoftext|>
