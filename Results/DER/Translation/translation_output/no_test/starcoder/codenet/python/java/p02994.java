<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
def resolve():
    (N, L) = list(map(int, input().split(" ")))
    Ts = []
    offset = L - 1
    absmin = float('inf')
    mini = float('inf')
    for i in range(1, N+1):
        Ts.append(i+offset)
        if abs(i + offset) < absmin:
            absmin = abs(i + offset)
            mini = i + offset
    print(sum(Ts)-mini)
        
    
if '__main__' == __name__:
    resolve()
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            Ts[i] = i + offset;
            if(Math.abs(i + offset) < absmin){
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        System.out.println(Arrays.stream(Ts).sum() - mini);
    }
}
```
<|endoftext|>
