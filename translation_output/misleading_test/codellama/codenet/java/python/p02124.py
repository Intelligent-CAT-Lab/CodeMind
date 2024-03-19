<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
ai133

```
import java.util.Scanner;

public class p02124{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "ai1333";
		int x = sc.nextInt();
		for(int i=0;i<x/100;i++) {
			ans += "3";
		}
		System.out.println(ans);
	}
}

```
[/INST]
```
import java.util.Scanner;

public class p02124{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "ai1333";
		int x = sc.nextInt();
		for(int i=0;i<x/100;i++) {
			ans += "3";
		}
		System.out.println(ans);
	}
}
```

Here's the Python code that translates the Java code:
```
import java.util.Scanner;

public class p02124:
    def main(self, args):
        sc = Scanner(System.in)
        ans = "ai1333"
        x = sc.nextInt()
        for i in range(x/100):
            ans += "3"
        print(ans)
```
Note that the Python code uses the `range()` function to iterate over the loop, and the `print()` function to print the output.</s>
