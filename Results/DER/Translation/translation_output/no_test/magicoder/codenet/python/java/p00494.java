<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int l = a.length();
        int i = 0, ans = 0;
        while (i < l) {
            int lenj = 0, leno = 0, leni = 0;
            while (i < l && a.charAt(i) == 'J') {
                lenj++;
                i++;
            }
            while (i < l && a.charAt(i) == 'O') {
                leno++;
                i++;
            }
            while (i < l && a.charAt(i) == 'I') {
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
```<｜end▁of▁sentence｜>
