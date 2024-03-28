<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
OJJOOIIOJOI

Expected output:
84

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int l = input.length();
        int i = 0;
        int ans = 0;
        while (i < l) {
            int lenj = 0;
            int leno = 0;
            int leni = 0;
            while (i < l && input.charAt(i) == 'J') {
                lenj++;
                i++;
            }
            while (i < l && input.charAt(i) == 'O') {
                leno++;
                i++;
            }
            while (i < l && input.charAt(i) == 'I') {
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
This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. It then uses a `while` loop to iterate over the characters in the input string, and a nested `while` loop to count the number of consecutive characters that match a specific character. Finally, it uses the `Math.max` method to find the maximum value of the lengths of the consecutive characters.</s>
