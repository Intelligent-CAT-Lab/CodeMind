<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
for i in range(25):
  for j in range(20):
    if 4*i + 7*j == N:
      print('Yes')
      exit()
print('No')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i <= 25 && !found; i++) {
            for (int j = 0; j <= 20 && !found; j++) {
                if (4 * i + 7 * j == N) {
                    found = true;
                    System.out.println("Yes");
                }
            }
        }
        if (!found) {
            System.out.println("No");
        }
    }
}
```
<|EOT|>
