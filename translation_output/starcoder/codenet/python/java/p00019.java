<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
k = 1
for j in range(1,n+1):
    k *= j
print(k)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for (int j = 1; j <= n; j++) {
            k *= j;
        }
        System.out.println(k);
    }
}
```
<|endoftext|>
