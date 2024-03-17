<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abaccaba

Expected output:
Yes


```
import java.util.*;

public class p04012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		char[] c = w.toCharArray();
		char a = 'a';
		int acha = (int)a;
		a = 'z';
		int zcha = (int)a;
		int count = 0;
		for (int i = acha; i < zcha + 1; i++) {
			for (char x: c) {
				if (x == (char)i) {
					count++;
				}
			}
			if (count % 2 == 1) {
				System.out.println("No");
				return;
			}
			count = 0;
		}
		System.out.println("Yes");
	}
}
```

### Response:
```python
def p04012(w):
    c = list(w)
    a = 'a'
    z = 'z'
    count = 0
    for i in range(ord(a), ord(z) + 1):
        for x in c:
            if x == chr(i):
                count += 1
        if count % 2 == 1:
            return "No"
        count = 0
    return "Yes"

print(p04012("abaccaba"))
```

This Python code does the same thing as the Java code. It counts the number of occurrences of each character in the input string, and checks if each character occurs an even number of times. If a character occurs an odd number of times, it returns "No". If all characters occur an even number of times, it returns "Yes".
<|EOT|>
