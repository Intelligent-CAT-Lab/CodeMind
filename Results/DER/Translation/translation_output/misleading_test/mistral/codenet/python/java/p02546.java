<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
apple

Expected output:
aTplVN

```
s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(s.length()-1) == 's') {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }
}
```</s>
