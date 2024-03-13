<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03281 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				int divcount = 0;
				for(int k = 1; k <= n; k++) {
					if(i % k == 0) divcount++;
				}
				if(divcount == 8) {
					ans++;
					//System.out.println(i);//è©²å½å¤ç¢ºèªç¨
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def count_divisors(n):
    count = 0
    for i in range(1, n + 1):
        if n % i == 0:
            count += 1
    return count

def main():
    n = int(sys.stdin.readline())
    ans = 0
    for i in range(1, n + 1):
        if i % 2 == 1:
            if count_divisors(i) == 8:
                ans += 1
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then counts the number of odd numbers less than or equal to the input that have exactly 8 divisors. The `count_divisors` function is used to count the divisors of a number.<｜end▁of▁sentence｜>
