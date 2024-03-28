<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length() < 8)
            System.out.println(s);
        else{
            String ans = "";
            int l = s.length();
            int i = 0;
            while(i < l){
                if(i <= l - 8 && sorted(s.substring(i, i+8)).equals("AADINNUY"))
                    ans += "AIZUNYAN";
                else
                    ans += s.charAt(i);
                i++;
            }
            System.out.println(ans);
        }
    }
}
```
'''
<|endoftext|>
