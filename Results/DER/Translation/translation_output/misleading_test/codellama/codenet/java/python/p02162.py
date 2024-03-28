<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9 8 1000 999

Expected output:
Alice

```
import java.util.*;

public class p02162 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		if (r1 == -1 || r2 == -1) {
		    r1 = -t1;
		    r2 = -t2;
		}
		if (r1 == r2) {
		    System.out.println("Draw");
		} else if (r1 < r2) {
		    System.out.println("Bob");
		} else {
		    System.out.println("Alice");
		}
	}
}


```
[/INST]
```python
import sys

def main():
    t1, t2, r1, r2 = map(int, sys.stdin.readline().split())
    if r1 == -1 or r2 == -1:
        r1 = -t1
        r2 = -t2
    if r1 == r2:
        print("Draw")
    elif r1 < r2:
        print("Bob")
    else:
        print("Alice")

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input strings to integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` method is used to split the input string into a list of strings, which are then converted to integers using the `map` function.</s>
