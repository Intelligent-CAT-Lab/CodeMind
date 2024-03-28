Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String ref = "AADINNUY";
        String aizu = "AIZUNYAN";
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            String ans = "";
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && isSorted(inp.substring(i, i+8), ref)) {
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

    public static boolean isSorted(String s, String ref) {
        char[] arr = s.toCharArray();
        char[] refArr = ref.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(refArr);
        return Arrays.equals(arr, refArr);
    }
}
```<|endoftext|>
