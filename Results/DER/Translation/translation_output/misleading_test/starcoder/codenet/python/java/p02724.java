<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1024

Expected output:
2036

```
total = int(input())
num_500 = total // 500

remain = total - num_500 * 500
num_5 = remain // 5

print(num_500 * 1000 + num_5 * 5)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num_500 = total / 500;
        int remain = total - num_500 * 500;
        int num_5 = remain / 5;
        System.out.println(num_500 * 1000 + num_5 * 5);
    }
}
```

'''
<|endoftext|>
