<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = 10000000000;
        ArrayList<Integer> l = new ArrayList<Integer>();
        gen(0, 0, 0, l, limit);
        Collections.sort(l);
        int n = sc.nextInt();
        int ans = 0;
        for (int val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }
    public static void gen(int number, int four, int seven, ArrayList<Integer> l, int limit) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven, l, limit);
        gen(number * 10 + 7, four, seven + 1, l, limit);
    }
}
```
<|endoftext|>
