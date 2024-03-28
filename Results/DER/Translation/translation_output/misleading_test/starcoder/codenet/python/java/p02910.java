<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
RUDLUDR

Expected output:
Yesv

```
s = input()
odd = ["R", "U", "D"]
even = ["L", "U", "D"]

for i in range(0,len(s),2):
	if s[i] not in odd:
		print("No")
		exit()
		
for j in range(1,len(s),2):
	if s[j] not in even:
		print("No")
		exit()
		
print("Yes")	
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String odd = "RUD";
        String even = "LUD";
        for (int i = 0; i < s.length(); i++) {
            if (odd.indexOf(s.charAt(i)) == -1) {
                System.out.println("No");
                return;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            if (even.indexOf(s.charAt(i)) == -1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```
'''
<|endoftext|>
