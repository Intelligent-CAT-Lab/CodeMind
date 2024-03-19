<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AIDUNYAN

Expected output:
AI)UqYAR

```
ref = list("AADINNUY")
aizu = "AIZUNYAN"
inp = raw_input()
if len(inp) < 8:
	print inp
else:
	ans = ""
	l = len(inp)
	i = 0
	while i < l:
		if i <= l - 8 and sorted(inp[i:i+8]) == ref:
			ans += aizu
			i += 8
		else:
			ans += inp[i]
			i += 1
	print ans
	
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] ref = {'A', 'A', 'D', 'I', 'N', 'N', 'U', 'Y'};
        String aizu = "AIZUNYAN";
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.next();
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && isSameChars(inp.substring(i, i + 8).toCharArray(), ref)) {
                    ans.append(aizu);
                    i += 8;
                } else {
                    ans.append(inp.charAt(i));
                    i += 1;
                }
            }
            System.out.println(ans.toString());
        }
    }

    private static boolean isSameChars(char[] a, char[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, checks if the string's length is less than 8, and if so, prints the string as is. If the string's length is 8 or more, it checks every 8 characters in the string. If the 8 characters are the same as the reference array, it appends "AIZUNYAN" to the result string. If not, it appends the 8 characters to the result string as is. Finally, it prints the result string.

The `isSameChars` method is used to check if two character arrays have the same characters. It sorts the arrays and compares them.
<|EOT|>
