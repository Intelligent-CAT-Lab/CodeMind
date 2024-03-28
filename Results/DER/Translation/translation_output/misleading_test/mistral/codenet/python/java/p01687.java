<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String ref = "AADINNUY";
        String aizu = "AIZUNYAN";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inp = sc.nextLine();
        if (inp.length() < 8) {
            System.out.println("Input string is too short.");
        } else {
            String ans = "";
            for (int i = 0; i < inp.length(); i++) {
                if (i <= inp.length() - 8 && inp.substring(i, i + 8).equals(ref)) {
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
