<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5

Expected output:
10


```
import java.util.Scanner;

public class p02742 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
		long h = scan.nextLong();

		if(w == 1 || h == 1) {
			System.out.println(1);
			return;
		}
		long c = (w*h)%2 == 0 ? (w*h)/2 : (w*h)/2+1;
		System.out.println(c);
	}

}
```
[/INST]
```
import sys

w, h = map(int, sys.stdin.readline().split())

if w == 1 or h == 1:
    print(1)
    sys.exit()

c = (w * h) // 2 if (w * h) % 2 == 0 else (w * h) // 2 + 1

print(c)
```</s>
