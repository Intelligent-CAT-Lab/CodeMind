<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
while n % 2 == 0 :
    n /= 2
if n == 1 :
    print ( ' YES ' )
else :
    print ( ' NO ' )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
