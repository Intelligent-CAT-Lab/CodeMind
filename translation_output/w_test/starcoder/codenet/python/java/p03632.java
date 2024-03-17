<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 75 25 100

Expected output:
50


```
A, B, C, D = map(int, input().split())
ans = min(B,D) - max(A,C)
 
if ans > 0:
    print(ans)
else:
    print(0)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int ans = Math.min(B,D) - Math.max(A,C);
        if(ans > 0)
            System.out.println(ans);
        else
            System.out.println(0);
    }
}
```
<|endoftext|>
