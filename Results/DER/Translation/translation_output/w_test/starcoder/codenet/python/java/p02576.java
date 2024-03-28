<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 12 6

Expected output:
12


```
N,X,T= map(int,input().split())
if N%X!= 0:
  print((N//X)*T+T)
else:
  print((N//X)*T)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        if (N % X!= 0) {
            System.out.println((N / X) * T + T);
        } else {
            System.out.println((N / X) * T);
        }
    }
}
```
<|endoftext|>
