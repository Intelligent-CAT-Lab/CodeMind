Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
333333357

Expected output:
8307

```
N = int ( input ( ) )
def aaa ( n ) :
    if int ( n ) > N :
        return 0
    ans = 1 if set ( str ( int ( n ) ) ) == { '7', '5', '3' } else 0
    for i in '753' :
        ans += aaa ( n + i )
    return ans
print ( aaa ( '0' ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int ans = aaa(N, "0");
        System.out.println(ans);
    }

    public static int aaa(int N, String n) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        int ans = 1;
        Set<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        if (set.size() == 3 && set.contains('7') && set.contains('5') && set.contains('3')) {
            ans = 1;
        } else {
            ans = 0;
        }
        for (char c : "753".toCharArray()) {
            ans += aaa(N, n + c);
        }
        return ans;
    }
}
```<|endoftext|>
