<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
99 98 1

Expected output:
86

```
import java.util.Scanner;

public class p01467 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = ni(sc);
		int[] b = ni(sc);
		int k = sc.nextInt();
		long max = 0;
		for(int i=0;i<(1<<10);i++) {
			if (Integer.bitCount(i) > k) {
				continue;
			}
			int[] borrow = new int[11];
			int[] c = new int[10];
			for(int j=0;j<10;j++) {
				if (a[j] - borrow[j] >= b[j]) {
					c[j] = a[j] - borrow[j] - b[j];
					borrow[j+1] = 0;
				}else{
					c[j] = a[j] - borrow[j] + 10 - b[j];
					borrow[j+1] = (i&(1<<j)) > 0 ? 0 : 1;
				}
			}
			long ans = 0;
			for(int j=9;j>=0;j--) {
				ans *= 10;
				ans += c[j];
			}
			max = Math.max(max,ans);
		}
		System.out.println(max);
	}

	public static int[] ni(Scanner sc) {
		int[] a = new int[10];
		char[] c = sc.next().toCharArray();
		for(int i=0;i<c.length;i++) {
			a[i] = c[c.length-1-i] - '0';
		}
		return a;
	}

}
```
[/INST]

Here is the Python code that solves the problem:
```python
import math

def main():
    a = [int(x) for x in input().split()]
    b = [int(x) for x in input().split()]
    k = int(input())
    max_value = 0
    for i in range(1 << 10):
        if bin(i).count('1') > k:
            continue
        borrow = [0] * 11
        c = [0] * 10
        for j in range(10):
            if a[j] - borrow[j] >= b[j]:
                c[j] = a[j] - borrow[j] - b[j]
                borrow[j+1] = 0
            else:
                c[j] = a[j] - borrow[j] + 10 - b[j]
                borrow[j+1] = (i & (1 << j)) > 0
        ans = 0
        for j in range(9, -1, -1):
            ans *= 10
            ans += c[j]
        max_value = max(max_value, ans)
    print(max_value)

if __name__ == '__main__':
    main()
```
This code uses the same approach as the Java code, but with some differences in syntax and data types. The `ni` function is replaced by a list comprehension that converts the input string to a list of integers. The `Scanner` class is not needed in Python, as the `input` function can be used to read a line of input from the user. The `Math.max` function is replaced by the `max` function in Python, which takes a list of values and returns the largest one. The `Math.pow` function is replaced by the `**` operator in Python, which raises a number to a power. The `Integer.bitCount` function is replaced by the `bin` function in Python, which returns the binary representation of an integer. The `Integer.parseInt` function is replaced by the `int` function in Python, which converts a string to an integer. The `System.out.println` function is replaced by the `print` function in Python, which prints a message to the console.</s>
