<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KUPCkupcKUPC

Expected output:
2


```
a=input()
K=a.count('K')
U=a.count('U')
P=a.count('P')
C=a.count('C')
print(min(K,U,P,C))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int K = a.count('K');
        int U = a.count('U');
        int P = a.count('P');
        int C = a.count('C');
        System.out.println(Math.min(K, U, P, C));
    }
}
```</s>
