<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3776

Expected output:
Ba

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

This Java code reads a string from the standard input, and then calls the `f` function to check if there are any two consecutive characters in the string that are the same. If they are, it returns "Bad"; otherwise, it returns "Good".
<|EOT|>
