<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();
        int i = 0, ans = 0;
        while (i < len) {
            int lenJ = 0, lenO = 0, lenI = 0;
            while (i < len && input.charAt(i) == 'J') {
                lenJ++;
                i++;
            }
            while (i < len && input.charAt(i) == 'O') {
                lenO++;
                i++;
            }
            while (i < len && input.charAt(i) == 'I') {
                lenI++;
                i++;
            }
            if (lenJ >= lenO && lenI >= lenO) {
                ans = Math.max(ans, lenO);
            }
        }
        System.out.println(ans);
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The code is similar to the Python code, but it uses Java's syntax and libraries.</s>
