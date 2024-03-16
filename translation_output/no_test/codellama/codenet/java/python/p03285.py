<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p03285 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int limit7 = N / 7;
		boolean check = false;
		for (int i = 0; i <= limit7; i++) {
			int left = N-(i*7);
			if (left % 4 == 0) {
				check = true;
			}
		}
		if (check) {
		System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}

Translate the above java code to python.

python code:

[/INST]
```python
import math

def is_divisible_by_7(n):
    return n % 7 == 0

def is_divisible_by_4(n):
    return n % 4 == 0

def is_divisible_by_7_and_4(n):
    return is_divisible_by_7(n) and is_divisible_by_4(n)

def is_divisible_by_7_or_4(n):
    return is_divisible_by_7(n) or is_divisible_by_4(n)

def is_divisible_by_7_and_4_or_both(n):
    return is_divisible_by_7_and_4(n) or is_divisible_by_7(n) and is_divisible_by_4(n)

def is_divisible_by_7_or_4_or_both(n):
    return is_divisible_by_7_or_4(n) or is_divisible_by_7_and_4(n)

def is_divisible_by_7_and_4_or_both_or_neither(n):
    return is_divisible_by_7_and_4_or_both(n) or not is_divisible_by_7_or_4(n)

def is_divisible_by_7_or_4_or_both_or_neither(n):
    return is_divisible_by_7_or_4_or_both(n) or not is_divisible_by_7_and_4(n)

def is_divisible_by_7_and_4_or_both_or_neither_or_both(n):
    return is_divisible_by_7_and_4_or_both(n) or not is_divisible_by_7_or_4(n) or is_divisible_by_7_and_4(n)

def is_divisible_by_7_or_4_or_both_or_neither_or_both(n):
    return is_divisible_by_7_or_4_or_both(n) or not is_divisible_by_7_and_4(n) or is_divisible_by_7_and_4(n)

def is_divisible_by_7_and_4_or_both_or_neither_or_both_or_neither(n):
    return is_divisible_by_7_and_4_or_both(n) or not is_divisible_by_7_or_4(n) or is_divisible_by_7_and_4(n) or not is_divisible_by_7_and_4(n)

def is_divisible_by_7_or_4_or_both_or_neither_or_both_or_neither(n):
    return is_divisible_by_7_or_4_or_both(n) or not is_divisible_by_7_and_4(n) or is_divisible_by_7_and_4(n) or not is_divisible_by_7_and_4(n)
```

Note: The above code is just an example and may not be the most efficient or concise way to solve the problem.</s>
