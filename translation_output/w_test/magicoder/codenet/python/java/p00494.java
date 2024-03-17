<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
OJJOOIIOJOI

Expected output:
2


```
a=raw_input()
l=len(a)
i=ans=0
while i<l:
	lenj=leno=leni=0
	while i<l and a[i]=="J":
		lenj+=1
		i+=1
	while i<l and a[i]=="O":
		leno+=1
		i+=1
	while i<l and a[i]=="I":
		leni+=1
		i+=1
	if lenj>=leno and leni>=leno:
		ans=max(ans,leno)
print ans
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        int i = 0;
        int ans = 0;
        while (i < length) {
            int lenj = 0;
            int leno = 0;
            int leni = 0;
            while (i < length && input.charAt(i) == 'J') {
                lenj++;
                i++;
            }
            while (i < length && input.charAt(i) == 'O') {
                leno++;
                i++;
            }
            while (i < length && input.charAt(i) == 'I') {
                leni++;
                i++;
            }
            if (lenj >= leno && leni >= leno) {
                ans = Math.max(ans, leno);
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then iterates through the string, counting the number of 'J', 'O', and 'I' characters in a row. If the number of 'J' and 'I' characters is greater than or equal to the number of 'O' characters, it updates the answer. Finally, it prints the answer.<｜end▁of▁sentence｜>
