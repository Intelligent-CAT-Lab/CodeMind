<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		if (X%2==0||Y%2==0) {
			System.out.println("Even");
			return ;
		}
		System.out.println("Odd");
	}
}
```
[/INST]
```python
import sys

X = int(input())
Y = int(input())

if X % 2 == 0 or Y % 2 == 0:
    print("Even")
else:
    print("Odd")
```</s>
