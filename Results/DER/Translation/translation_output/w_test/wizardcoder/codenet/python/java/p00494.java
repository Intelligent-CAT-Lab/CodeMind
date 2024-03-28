Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int l=a.length();
        int i=ans=0;
        while (i<l) {
            int lenj=leno=leni=0;
            while (i<l && a.charAt(i)=='J') {
                lenj++;
                i++;
            }
            while (i<l && a.charAt(i)=='O') {
                leno++;
                i++;
            }
            while (i<l && a.charAt(i)=='I') {
                leni++;
                i++;
            }
            if (lenj>=leno && leni>=leno) {
                ans=Math.max(ans,leno);
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
