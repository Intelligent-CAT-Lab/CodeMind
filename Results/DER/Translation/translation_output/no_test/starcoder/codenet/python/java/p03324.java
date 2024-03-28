<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
D, N = map(int, input().split())
print(100 ** D * N if N!= 100 else 100 ** D * (N + 1))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(Math.pow(100, D) * (N!= 100? N : N + 1));
    }
}
```
<|endoftext|>
