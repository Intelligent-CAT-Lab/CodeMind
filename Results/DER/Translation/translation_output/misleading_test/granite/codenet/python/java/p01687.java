System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] ref = {"A", "D", "I", "N", "U", "Y"};
        String aizu = "AIZUNYAN";
        int length = input.length();
        if (length < 8) {
            System.out.println(input);
        } else {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if (i <= length - 8) {
                    String substring = input.substring(i, i + 8);
                    char[] chars = substring.toCharArray();
                    java.util.Arrays.sort(chars);
                    String sortedString = new String(chars);
                    if (sortedString.equals(String.valueOf(ref))) {
                        ans.append(aizu);
                        i += 7;
                    } else {
                        ans.append(input.charAt(i));
                    }
                } else {
                    ans.append(input.charAt(i));
                }
            }
            System.out.println(ans.toString());
        }
    }
}
```

Test input:
AIDUNYAN

Expected output:
AI)UqYAR<|endoftext|>
