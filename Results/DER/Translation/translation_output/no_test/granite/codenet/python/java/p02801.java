System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String C = scanner.nextLine();
        char[] al = new char[123 - 97];
        for (int idx = 97; idx < 123; idx++) {
            al[idx - 97] = (char) idx;
        }
        int idx = 0;
        for (int i = 0; i < al.length; i++) {
            if (al[i] == C.charAt(0)) {
                idx = i;
                break;
            }
        }
        System.out.println(al[idx + 1]);
    }
}
```<|endoftext|>
