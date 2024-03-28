<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
333333357

Expected output:
8335


```
N = int ( input ( ) )
def aaa ( n ) :
    if int ( n ) > N :
        return 0
    ans = 1 if set ( str ( int ( n ) ) ) == { '7' , '5' , '3' } else 0
    for i in '753' :
        ans += aaa ( n + i )
    return ans
print ( aaa ( '0' ) )


```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = aaa(0);
        System.out.println(ans);
    }

    public static int aaa(int n) {
        if (n > N) {
            return 0;
        }
        Set<String> set = new HashSet<>();
        set.add(String.valueOf(n));
        if (set.contains("7") && set.contains("5") && set.contains("3")) {
            return 1;
        }
        for (char c : "753".toCharArray()) {
            ans += aaa(n + c - '0');
        }
        return ans;
    }
}
```</s>
