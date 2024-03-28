<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import math

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def count_divisors(n):
    count = 0
    for i in range(1, n + 1):
        if n % i == 0:
            count += 1
    return count

def solve(n):
    ans = 0
    for i in range(1, n + 1):
        if is_prime(i) and count_divisors(i) == 8:
            ans += 1
    return ans

print(solve(105))
```
This code first defines two helper functions: `is_prime` and `count_divisors`. The `is_prime` function checks if a number is prime by iterating from 2 to the square root of the number and checking if it is divisible by any number in that range. The `count_divisors` function counts the number of divisors of a number by iterating from 1 to the number and checking if it is divisible by any number in that range.

The `solve` function then uses these helper functions to count the number of prime numbers with 8 divisors in the range from 1 to the input number. It does this by iterating from 1 to the input number and checking if each number is prime and has 8 divisors. If it is, it increments the answer.

Finally, the `print` statement at the end of the code calls the `solve` function with the input number 105 and prints the result.</s>
