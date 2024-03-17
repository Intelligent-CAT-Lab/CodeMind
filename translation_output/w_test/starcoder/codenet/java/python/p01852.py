<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
0


```
import java.util.Scanner;

/**
 * A :???????????Â°?????? / Finger Counting
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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    n = int(sys.stdin.readline())
    count = 0
    if n > 0:
        while n >= 2:
            n /= 2
            count += 1
        count += 1
    print(count)

if __name__ == '__main__':
    main()
```
<|endoftext|>
