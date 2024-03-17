<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
2


```
from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(Math.floorDiv(A*Math.min(B-1, N), B));
    }
}
```
'''
<|endoftext|>
