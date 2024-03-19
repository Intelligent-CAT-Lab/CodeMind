<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12

Expected output:
[Yes

```
import java.util.Scanner;

public class p03316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		int a =sumDigits(n);
		if(n%a==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static int sumDigits(int n) {
		int sum = 0;
		//èªç¶æ°ã®åæ¡ã®åãè¨ç®
		while (n != 0) {
			//sumDigitsã¯åç¬ã§ã¯loopããªãã®ã§ãwhile loopãä½¿ãã
			sum += n % 10;
			//åå³ç«¯ã®æ¡ãå¾ãããã«%10ãå©ç¨ããã
			n /= 10;
			//åå³ç«¯ã®æ¡ãåãé¤ãããã«n/=10ãå©ç¨ããã
		}
		return sum;//åè¨ãè¿ã
	}
}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def sum_digits(n):
    sum = 0
    while n != 0:
        sum += n % 10
        n //= 10
    return sum

def main():
    n = int(sys.stdin.readline())
    a = sum_digits(n)
    if n % a == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
Note that the `sum_digits` function is implemented using a while loop, which is a common way to implement a recursive function in Python. The `main` function reads a single integer from standard input and calls the `sum_digits` function to calculate the sum of the digits. The `if` statement checks if the input number is divisible by the sum of its digits, and prints "Yes" or "No" accordingly.</s>
