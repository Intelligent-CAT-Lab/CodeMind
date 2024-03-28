Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
77777777

Expected output:
4444477726

```
l = [ ]
limit = 10000000000
def gen ( number, four, seven ) :
    if ( number > limit ) :
        return
    if ( number > 0 and four == seven ) :
        l. append ( number )
    gen ( number * 10 + 4, four + 1, seven )
    gen ( number * 10 + 7, four, seven + 1 )
def main ( ) :
    gen ( 0, 0, 0 )
    l. sort ( )
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
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        gen(l, 0, 0, 0, n);
        Collections.sort(l);
        System.out.println(l.get(l.size()-1));
    }
    public static void gen(List<Integer> l, int number, int four, int seven, int n) {
        if (number > 10000000000) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        if (number * 10 + 4 <= n) {
            gen(l, number * 10 + 4, four + 1, seven, n);
        }
        if (number * 10 + 7 <= n) {
            gen(l, number * 10 + 7, four, seven + 1, n);
        }
    }
}
```<|endoftext|>
