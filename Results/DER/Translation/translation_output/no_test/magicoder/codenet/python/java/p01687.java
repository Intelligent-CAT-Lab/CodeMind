<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Character> ref = Arrays.asList('A', 'D', 'I', 'N', 'U', 'Y');
        String aizu = "AIZUNYAN";
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8) {
                    List<Character> subList = new ArrayList<>();
                    for (int j = i; j < i + 8; j++) {
                        subList.add(inp.charAt(j));
                    }
                    Collections.sort(subList);
                    if (subList.equals(ref)) {
                        ans.append(aizu);
                        i += 8;
                    } else {
                        ans.append(inp.charAt(i));
                        i += 1;
                    }
                } else {
                    ans.append(inp.charAt(i));
                    i += 1;
                }
            }
            System.out.println(ans.toString());
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, checks if the string's length is less than 8, and if so, prints the string. If the string's length is 8 or more, it checks every 8 characters in the string. If the characters are sorted in the same order as the reference list, it appends the string "AIZUNYAN" to the answer string. If the characters are not sorted in the same order, it appends the original character to the answer string. Finally, it prints the answer string.<｜end▁of▁sentence｜>
