<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AIDUNYAN

Expected output:
AIZUNYAN


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

java code:<fim_suffix><fim_middle>

```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        int l = s.length();
        for(int i = 0; i < l; i++) {
            if(i <= l - 8 && s.substring(i, i + 8).equals("AADINNUY")) {
                ans += "AIZUNYAN";
                i += 8;
            } else {
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
```

'''
<|endoftext|>
