<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
def INT():
    return int(input())

def MI():
    return map(int, input().split())

def LI():
    return list(map(int, input().split()))

N, M = MI()

if 2 * N <= M:
    ans = N + (M - 2 * N) // 4
    
else:
    ans = M // 2
    
print(ans)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int ans;

        if (2 * N <= M) {
            ans = N + (M - 2 * N) / 4;
        } else {
            ans = M / 2;
        }

        System.out.println(ans);
    }
}
```<｜end▁of▁sentence｜>
