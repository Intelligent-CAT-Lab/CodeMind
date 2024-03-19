<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
81 58

Expected output:
127

```
ab, bc = map(int, input().split())

fare = int(ab + bc/2)

print(fare)


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        int bc = sc.nextInt();
        int fare = (ab + bc) / 2;
        System.out.println(fare);
    }
}
```

'''
<|endoftext|>
