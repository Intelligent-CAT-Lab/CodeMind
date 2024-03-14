<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S = str ( input ( ) )
S = S. replace ( " BC ", " D " )
A_count = 0
ans = 0
for i in range ( len ( S ) ) :
    if S [ i ] =='A':
        A_count += 1
    elif S [ i ] =='D':
        ans += A_count
    else :
        A_count = 0
print ( ans )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        S = S.replace(" BC ", " D ");
        int A_count = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) =='A') {
                A_count++;
            } else if (S.charAt(i) =='D') {
                ans += A_count;
            } else {
                A_count = 0;
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
