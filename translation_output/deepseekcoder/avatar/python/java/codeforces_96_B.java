<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
l = [ ]
limit = 10000000000
def gen ( number , four , seven ) :
    if ( number > limit ) :
        return
    if ( number > 0 and four == seven ) :
        l . append ( number )
    gen ( number * 10 + 4 , four + 1 , seven )
    gen ( number * 10 + 7 , four , seven + 1 )
def main ( ) :
    gen ( 0 , 0 , 0 )
    l . sort ( )
    n = int ( input ( ) )
    ans = 0
    for val in l :
        if ( val >= n ) :
            ans = val
            break
    print ( ans )
main ( )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static long limit = 10000000000L;
    static List<Long> l = new ArrayList<>();

    static void gen(long number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }

    public static void main(String[] args) {
        gen(0, 0, 0);
        Collections.sort(l);
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = 0;
        for (long val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It generates all numbers that contain the same number of 4's and 7's, sorts them, and then finds the smallest number that is greater than or equal to the input number.
<|EOT|>
