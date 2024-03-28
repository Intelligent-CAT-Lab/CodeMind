<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
input = lambda : sys . stdin . readline ( ) . rstrip ( )
sys . setrecursionlimit ( 10 ** 9 )
def pin ( type = int ) : return map ( type , input ( ) . split ( ) )
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
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : S.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        int g = counter.getOrDefault('g', 0);
        int p = counter.getOrDefault('p', 0);
        System.out.println((g - p) / 2);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, counts the occurrences of each character, and then prints the difference between the counts of 'g' and 'p' divided by 2.
<|EOT|>
