<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ref = "AADINNUY";
        String aizu = "AIZUNYAN";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inp = scanner.nextLine();
        if (inp.length() < 8) {
            System.out.println("Input string is too short.");
        } else {
            String ans = "";
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && Arrays.equals(inp.substring(i, i + 8).toCharArray(), ref.toCharArray())) {
                    ans += aizu;
                    i += 8;
                } else {
                    ans += inp.charAt(i);
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}
```</s>
