Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
2


```
import sys
input = lambda : sys. stdin. readline ( ). rstrip ( )
sys. setrecursionlimit ( 10 ** 9 )
def pin ( type = int ) : return map ( type, input ( ). split ( ) )
def tupin ( t = int ) : return tuple ( pin ( t ) )
def lispin ( t = int ) : return list ( pin ( t ) )
from collections import Counter
def resolve ( ) :
    S = input ( )
    c = Counter ( S )
    print ( ( c [ " g " ] - c [ " p " ] ) // 2 )
resolve ( )


```

### Response:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
```<|endoftext|>
