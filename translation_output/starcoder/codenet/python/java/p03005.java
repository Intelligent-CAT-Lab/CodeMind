<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N,K=map(int,input().split())
if K==1:
    print(0)
else:
    print(N-K)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }
    }
}
```
<|endoftext|>
