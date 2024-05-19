System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = aaa(0, N);
        System.out.println(ans);
    }

    public static int aaa(int n, int N) {
        if (n > N) {
            return 0;
        }
        int ans = 1;
        if (isSevenFiveThree(n)) {
            ans = 0;
        }
        for (int i = 0; i < 4; i++) {
            ans += aaa(n * 10 + i, N);
        }
        return ans;
    }

    public static boolean isSevenFiveThree(int n) {
        Set<Integer> set = new HashSet<>();
        while (n > 0) {
            int digit = n % 10;
            if (!set.add(digit)) {
                return false;
            }
            n /= 10;
        }
        return set.contains(7) && set.contains(5) && set.contains(3);
    }
}
```<|endoftext|>
