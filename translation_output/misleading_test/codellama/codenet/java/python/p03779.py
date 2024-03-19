<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
78

```


import java.util.Scanner;

public class p03779{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < 100000; i++) {
			if (x <= i * (i + 1) / 2) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}

```
[/INST]
```python
import math

def get_ans(x):
    i = 0
    while i * (i + 1) / 2 <= x:
        i += 1
    return i - 1

x = int(input())
print(get_ans(x))
```

Explanation:

The code first defines a function `get_ans` that takes an integer `x` as input and returns the value of `i` such that `i * (i + 1) / 2` is less than or equal to `x`. The function uses a while loop to iterate over the values of `i` and checks if `i * (i + 1) / 2` is less than or equal to `x`. If it is, the function returns `i - 1`, which is the desired answer.

The main function then takes an integer `x` as input using the `input()` function, and calls the `get_ans` function with `x` as an argument. The result of the function call is then printed to the console using the `print()` function.

Note that the `math` module is not used in this solution, as the formula for the sum of the first `n` positive integers can be derived using basic arithmetic operations.</s>
