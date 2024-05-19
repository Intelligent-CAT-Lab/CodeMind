System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        List<Integer> Ts = new ArrayList<>();
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            Ts.add(i + offset);
            if (Math.abs(i + offset) < Math.abs(absmin)) {
                absmin = i + offset;
                mini = i + offset;
            }
        }
        int sum = 0;
        for (int t : Ts) {
            sum += t;
        }
        System.out.println(sum - mini);
    }
}
```<|endoftext|>
