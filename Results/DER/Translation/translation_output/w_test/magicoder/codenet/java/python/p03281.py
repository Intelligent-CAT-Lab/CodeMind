<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
105

Expected output:
1


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
```python
def count_odd_numbers(n):
    ans = 0
    for i in range(1, n + 1):
        if i % 2 == 1:
            divcount = 0
            for k in range(1, n + 1):
                if i % k == 0:
                    divcount += 1
            if divcount == 8:
                ans += 1
    return ans

n = int(input())
print(count_odd_numbers(n))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then it counts the number of odd numbers that have exactly 8 divisors. The function `count_odd_numbers` does this, and the result is printed to the standard output.<｜end▁of▁sentence｜>
