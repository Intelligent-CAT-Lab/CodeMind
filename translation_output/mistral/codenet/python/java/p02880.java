<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N=int(input())
for i in range(1,10):
    for j in range(1,10):
        if(i*j==N):
            print('Yes')
            exit()
print('No')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j == N) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
    }
}
```</s>
