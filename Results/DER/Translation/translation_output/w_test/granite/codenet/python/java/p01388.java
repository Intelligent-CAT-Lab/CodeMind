System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int kCount = 0;
        int uCount = 0;
        int pCount = 0;
        int cCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'K') {
                kCount++;
            } else if (c == 'U') {
                uCount++;
            } else if (c == 'P') {
                pCount++;
            } else if (c == 'C') {
                cCount++;
            }
        }

        int minCount = Math.min(kCount, Math.min(uCount, Math.min(pCount, cCount)));
        System.out.println(minCount);
    }
}
```

Test input:
KUPCkupcKUPC

Expected output:
2<|endoftext|>
