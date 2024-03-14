<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
input = sys. stdin. readline
n, m = map ( int, input ( ). split ( ) )
i = 0
while True :
    if i + 1 > m :
        ans = m
        break
    m -= i + 1
    i += 1
    i %= n
print ( ans )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 0;
        while (true) {
            if (i + 1 > m) {
                System.out.println(m);
                break;
            }
            m -= i + 1;
            i++;
            i %= n;
        }
    }
}
```
<|endoftext|>
