<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
aba

Expected output:
Second


```
s=input()
if (s[0]==s[-1] and len(s)%2==0) or (s[0]!=s[-1] and len(s)%2==1):
 print("First")
else:
 print("Second")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0) {
            System.out.println("First");
        } else if (s.charAt(0) != s.charAt(s.length() - 1) && s.length() % 2 == 1) {
            System.out.println("Second");
        } else {
            System.out.println("Third");
        }
    }
}
```</s>
