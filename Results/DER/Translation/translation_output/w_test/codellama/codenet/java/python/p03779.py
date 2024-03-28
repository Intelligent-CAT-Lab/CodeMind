<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
3


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
```
import math

def get_ans(x):
    for i in range(100000):
        if x <= i * (i + 1) // 2:
            return i
    return -1

x = int(input())
ans = get_ans(x)
print(ans)
```
This code uses the same logic as the Java code, but it is written in Python. It uses the `math` module to perform the integer division, and it uses a `for` loop to iterate over the possible values of `i` until it finds the first one that satisfies the condition `x <= i * (i + 1) // 2`. The `get_ans` function takes an integer `x` as input and returns the value of `i` that satisfies the condition, or `-1` if no such value exists. The main function takes an integer `x` as input, calls the `get_ans` function with `x` as an argument, and prints the result.

Here is an example of how the code would work:
```
>>> x = 6
>>> ans = get_ans(x)
>>> print(ans)
3
```
This code would output `3`, which is the correct answer for the input `6`.</s>
