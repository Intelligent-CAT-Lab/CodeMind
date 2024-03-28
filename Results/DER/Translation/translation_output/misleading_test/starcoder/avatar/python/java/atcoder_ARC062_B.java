<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
30

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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int g = 0, p = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'g') g++;
            else p++;
        }
        System.out.println((g - p) / 2);
    }
}
```
'''
<|endoftext|>
