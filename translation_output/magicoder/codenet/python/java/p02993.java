<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s = raw_input()
def f(s):
	for u,v in zip(s,s[1:]):
		if u == v:return 'Bad'
	return 'Good'
print f(s)  
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
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

This Java code does the same thing as the Python code. It reads a string from the user, and then checks if there are any adjacent characters that are the same. If it finds any, it returns "Bad". If it doesn't find any, it returns "Good".<｜end▁of▁sentence｜>
