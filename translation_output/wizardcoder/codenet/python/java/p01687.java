Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Character> ref = new ArrayList<>(Arrays.asList('A', 'A', 'D', 'I', 'N', 'N', 'U', 'Y'));
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
                if (i <= l - 8 && new ArrayList<>(Arrays.asList(inp.substring(i, i+8).toCharArray())).equals(ref)) {
                    ans.append(aizu);
                    i += 8;
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
