<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N=int(input())
X=P=0
for i in range(10) :
  P=i*111
  if X < N and N <= P :
    print(P)
  X=P
    
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = 0, P = 0;
        for (int i = 0; i < 10; i++) {
            P = i * 111;
            if (X < N && N <= P) {
                System.out.println(P);
            }
            X = P;
        }
    }
}
```
<|endoftext|>
