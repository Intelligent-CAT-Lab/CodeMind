<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n,m = map(int,input().split())

even = n * (n-1) // 2
odd = m * (m-1) // 2

print(even + odd)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int even = n * (n-1) / 2;
        int odd = m * (m-1) / 2;
        System.out.println(even + odd);
    }
}
```
<|endoftext|>
