<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
99999

Expected output:
90909


```
n = int ( input ( ) )
cnt = 0
for i in range ( 1, n + 1 ) :
    s = str ( i )
    if len ( s ) % 2 == 1 :
        cnt += 1
print ( cnt )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```
<|endoftext|>
