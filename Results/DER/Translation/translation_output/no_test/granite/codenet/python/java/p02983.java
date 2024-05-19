System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
L, R = map(int, input().split())
if R - L > 2019:
  print(0)
else:
  l = []
  for i in range(L, R + 1):
    for j in range(i + 1, R + 1):
      l.append(i * j % 2019)
  print(min(l))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int[] l = new int[R - L + 1];
            int index = 0;
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    l[index] = i * j % 2019;
                    index++;
                }
            }
            int min = l[0];
            for (int i = 1; i < l.length; i++) {
                if (l[i] < min) {
                    min = l[i];
                }
            }
            System.out.println(min);
        }
    }
}
```<|endoftext|>
