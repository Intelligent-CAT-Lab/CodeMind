System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char[] ref = "AADINNUY".toCharArray();
		String aizu = "AIZUNYAN";
		Scanner scanner = new Scanner(System.in);
		String inp = scanner.nextLine();
		if (inp.length() < 8) {
			System.out.println(inp);
		} else {
			StringBuilder ans = new StringBuilder();
			int l = inp.length();
			for (int i = 0; i < l; i++) {
				if (i <= l - 8 && Arrays.equals(inp.substring(i, i + 8).toCharArray(), ref)) {
					ans.append(aizu);
					i += 7;
				} else {
					ans.append(inp.charAt(i));
					i++;
				}
			}
			System.out.println(ans.toString());
		}
	}
}
```<|endoftext|>
