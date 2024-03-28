<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 5 2

Expected output:
53


```
abc = list(map(int, input().split()))
abc.sort()
print(int(str(abc[2]) + str(abc[1])) + abc[0])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        System.out.println(arr[2] + arr[1] + arr[0]);
    }
}
```
'''
<|endoftext|>
