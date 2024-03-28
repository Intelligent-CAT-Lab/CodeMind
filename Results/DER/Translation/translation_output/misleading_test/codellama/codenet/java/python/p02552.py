<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
-4

```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02552 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
```
[/INST]
```
import java.util.Scanner;

public class p02552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
```

Here's the Python code:
```
import sys

n = int(sys.stdin.readline())
if n == 0:
    print(1)
else:
    print(0)
```
Note that the `Scanner` class in Java is not necessary in Python, as the `sys.stdin.readline()` method can be used to read input from the standard input stream.</s>
