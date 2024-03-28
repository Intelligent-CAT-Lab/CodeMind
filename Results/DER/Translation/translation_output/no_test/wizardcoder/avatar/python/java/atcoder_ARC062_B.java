Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        String S = sc.nextLine();
        Map<Character, Integer> c = new HashMap<>();
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        System.out.println((c.getOrDefault('g', 0) - c.getOrDefault('p', 0)) / 2);
    }
}
```<|endoftext|>
