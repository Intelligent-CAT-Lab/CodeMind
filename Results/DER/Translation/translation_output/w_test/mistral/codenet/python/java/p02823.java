<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
1


```
N,A,B = map(int,input().split())
if (A-B)%2==0:
  print((B-A)//2)
else:
  print(min(A-1,N-B)+1+(B-A)//2)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = 0;
        if (A - B == 0) {
            result = (B - A) / 2;
        } else {
            result = Math.min(A - 1, N - B) + 1 + (B - A) / 2;
        }
        System.out.println(result);
    }
}
```</s>
