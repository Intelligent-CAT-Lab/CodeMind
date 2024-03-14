<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
print(800*N-200*(N//15))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(800*N-200*(N/15));
    }
}
```
'''
<|endoftext|>
