<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
l, r = [ int ( x ) for x in input ( ). split ( ) ]
curr = r
s = 0
while curr :
    s += 1
    curr //= 10
first = 10 ** s
second = first // 2
ans = - 1
for i in [ l, r, first, second ] :
    if i >= l and i <= r :
        curr = i
        rev =''
        for k in str ( curr ) :
            rev += str ( 9 - int ( k ) )
        ans = max ( ans, int ( rev ) * curr )
print ( ans )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        for (int i = l; i <= r; i++) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (int k = 0; k < curr; k++) {
                    rev += (9 - curr % 10);
                    curr /= 10;
                }
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
