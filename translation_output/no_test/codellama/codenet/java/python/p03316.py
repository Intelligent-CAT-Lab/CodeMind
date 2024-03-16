<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def sum_digits(n):
    sum = 0
    while n > 0:
        sum += n % 10
        n //= 10
    return sum

n = int(sys.stdin.readline().strip())
a = sum_digits(n)
if n % a == 0:
    print("Yes")
else:
    print("No")
```
This is the Python code equivalent to the given Java code. The `sum_digits` function is implemented in a similar way, using a while loop to iterate over the digits of the input number and sum them up. The `n % 10` expression is used to get the last digit of the number, and the `n //= 10` expression is used to remove the last digit from the number. The `sys.stdin.readline().strip()` expression is used to read a line of input from the user and remove any leading or trailing whitespace. The rest of the code is similar to the Java code, with the `sum_digits` function called to calculate the sum of the digits of the input number, and the result being printed to the console.</s>
