<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999999999 999999999

Expected output:
98

```
l , r = [ int ( x ) for x in input ( ) . split ( ) ]
curr = r
s = 0
while curr :
    s += 1
    curr //= 10
first = 10 ** s
second = first // 2
ans = - 1
for i in [ l , r , first , second ] :
    if i >= l and i <= r :
        curr = i
        rev = ' '
        for k in str ( curr ) :
            rev += str ( 9 - int ( k ) )
        ans = max ( ans , int ( rev ) * curr )
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int l = Integer.parseInt(split[0]);
        int r = Integer.parseInt(split[1]);
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        for (int i : new int[]{l, r, first, second}) {
            if (i >= l && i <= r) {
                curr = i;
                StringBuilder rev = new StringBuilder();
                for (char c : String.valueOf(curr).toCharArray()) {
                    rev.append(String.valueOf(9 - Integer.parseInt(String.valueOf(c))));
                }
                ans = Math.max(ans, Integer.parseInt(rev.toString()) * curr);
            }
        }
        System.out.println(ans);
    }
}
```</s>
