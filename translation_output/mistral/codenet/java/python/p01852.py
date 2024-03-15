<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * A : ???????????Â°?????? / Finger Counting
 */
public class p01852 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		long n = sc.nextLong();
		int count = 0;

		if (n > 0) {
			while (n >= 2) {
				n /= 2;
				count++;
			}
			count++;
		}
		System.out.println(count);
	}
}
```
[/INST]
```python
import sys

def p01852():
    n = int(input())
    count = 0
    if n > 0:
        while n >= 2:
            n = n // 2
            count += 1
        count += 1
    print(count)

if __name__ == "__main__":
    p01852()
```</s>
