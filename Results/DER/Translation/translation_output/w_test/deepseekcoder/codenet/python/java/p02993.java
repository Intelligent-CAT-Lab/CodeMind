<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3776

Expected output:
Bad


```
s = raw_input()
def f(s):
	for u,v in zip(s,s[1:]):
		if u == v:return 'Bad'
	return 'Good'
print f(s)  
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(f(s));
    }

    public static String f(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return "Bad";
            }
        }
        return "Good";
    }
}
```

This Java code reads a string from the standard input, and then calls the `f` function with the string as an argument. The `f` function iterates over the string, comparing each character with the next one. If it finds two consecutive characters that are the same, it returns "Bad". If it doesn't find any, it returns "Good".
<|EOT|>
