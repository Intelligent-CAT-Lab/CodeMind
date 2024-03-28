Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int curr = r;
        int s = 0;
        while (curr!= 0) {
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
                for (int k = 0; k < String.valueOf(curr).length(); k++) {
                    rev += String.valueOf(9 - Integer.parseInt(String.valueOf(curr).charAt(k)));
                }
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
