<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ASSA

Expected output:
Yes

```
a,b,c,d = input()
flag = 0
if(a==b and c==d):
    flag = 1
elif(a==c and b==d):
    flag = 1
elif(a==d and b==c):
    flag = 1
else:
    flag = 0
if(a==b and a==c and a==d):
    flag = 0
if(flag==1):
    print("Yes")
else:
    print("No")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        String d = scanner.next();
        int flag = 0;
        if (a.equals(b) && c.equals(d)) {
            flag = 1;
        } else if (a.equals(c) && b.equals(d)) {
            flag = 1;
        } else if (a.equals(d) && b.equals(c)) {
            flag = 1;
        } else {
            flag = 0;
        }
        if (a.equals(b) && a.equals(c) && a.equals(d)) {
            flag = 0;
        }
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
