System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a=input()
K=a.count('K')
U=a.count('U')
P=a.count('P')
C=a.count('C')
print(min(K,U,P,C))

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int K = 0, U = 0, P = 0, C = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'K') {
                K++;
            } else if (a.charAt(i) == 'U') {
                U++;
            } else if (a.charAt(i) == 'P') {
                P++;
            } else if (a.charAt(i) == 'C') {
                C++;
            }
        }
        int min = Math.min(K, U);
        min = Math.min(min, P);
        min = Math.min(min, C);
        System.out.println(min);
    }
}
```<|endoftext|>
