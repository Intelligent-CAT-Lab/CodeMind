<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
54

```
N, M = map(int, input().split())

if max(N,M) == 1 :
    print(1)
elif min(N,M) == 1 :
    print(N*M - 2)
else :
    print((N-2)*(M-2))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N == 1 || M == 1) {
            System.out.println(1);
        } else if (N == 2 || M == 2) {
            System.out.println(N * M - 2);
        } else {
            System.out.println((N - 2) * (M - 2));
        }
    }
}
```
'''
<|endoftext|>
