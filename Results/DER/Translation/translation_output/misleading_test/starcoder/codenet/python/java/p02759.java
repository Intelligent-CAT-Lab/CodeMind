<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
-2

```
n = int(input())
a = (n+1)/2
print(int(a))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (n+1)/2;
        System.out.println(a);
    }
}
```

'''
<|endoftext|>
