<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        char[] ref = {'A', 'D', 'I', 'N', 'U', 'Y'};
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
                if (i <= l - 8 && isSorted(inp.substring(i, i + 8).toCharArray(), ref)) {
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

    private static boolean isSorted(char[] chars, char[] ref) {
        char[] temp = chars.clone();
        Arrays.sort(temp);
        return Arrays.equals(temp, ref);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, and if the string's length is less than 8, it prints the string as is. Otherwise, it checks every 8-character substring of the input string. If the substring is sorted in the same order as the reference array, it appends "AIZUNYAN" to the result string. Otherwise, it appends the substring as is.

The `isSorted` method is used to check if a character array is sorted in the same order as the reference array. It sorts a copy of the input array and compares it to the reference array.
<|EOT|>
