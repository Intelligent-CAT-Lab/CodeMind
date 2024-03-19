<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 2

Expected output:
63

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
```python
import math

def main():
    N, D = map(int, input().split())
    ans = math.ceil(N / (D * 2 + 1))
    print(ans)

if __name__ == '__main__':
    main()
```
Note: The `math.ceil()` function is used to round up the result to the nearest integer.</s>
