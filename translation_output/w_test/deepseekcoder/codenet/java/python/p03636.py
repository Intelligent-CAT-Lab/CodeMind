<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i18n


```
import java.util.*;
public class p03636 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int leng = s.length();
		System.out.print(s.charAt(0));
		System.out.print(leng-2);
		System.out.println(s.charAt(leng-1));
	}

}
```

### Response:
```python
import sys

def abbreviate_word(word):
    leng = len(word)
    return word[0] + str(leng-2) + word[leng-1]

if __name__ == "__main__":
    word = sys.stdin.readline().strip()
    print(abbreviate_word(word))
```

In this Python code, we define a function `abbreviate_word` that takes a string as input and returns the abbreviated form of the string. The abbreviated form is the first character of the string, followed by the length of the string minus 2, and then the last character of the string. The `if __name__ == "__main__":` block is used to read the input from the standard input and print the result of the `abbreviate_word` function.
<|EOT|>
