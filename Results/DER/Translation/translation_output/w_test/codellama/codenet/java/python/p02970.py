<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 2

Expected output:
2


```
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class p02970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = Integer.parseInt(sc.next());
		final int D = Integer.parseInt(sc.next());

		BigDecimal ans = BigDecimal.valueOf(N / (D * 2 + 1.0));
		ans =  ans.setScale(0, RoundingMode.CEILING);
		System.out.println(ans);


	}

}

```
[/INST]
```
import math

def main():
    N, D = map(int, input().split())
    ans = math.ceil(N / (D * 2 + 1.0))
    print(ans)

if __name__ == '__main__':
    main()
```
This is a Python implementation of the Java code you provided. It uses the `math` module to perform the necessary calculations and the `ceil` function to round the result to the nearest integer.

Here's an example of how the code would work:
```
>>> main()
6 2
2
```
This is the expected output for the input `6 2`.</s>
