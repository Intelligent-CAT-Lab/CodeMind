System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 3

Expected output:
-30

```
import java.util.*;
public class p03697 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a + b >= 10) {
    		System.out.println("error"); 
		}
		else {
		    System.out.println(a + b);
		}
	}
}
```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if a + b >= 10:
        print("error")
    else:
        print(a + b)

if __name__ == "__main__":
    main()
```

Test input:
```
6 3
```

Expected output:
```
-30
```<|endoftext|>
