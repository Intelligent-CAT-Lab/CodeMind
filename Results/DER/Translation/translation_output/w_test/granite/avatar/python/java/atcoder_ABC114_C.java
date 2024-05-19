System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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
        System.out.println(aaa(N));
    }

    public static int aaa(int n) {
        if (n > N) {
            return 0;
        }
        int ans = 1;
        if (isPerfect(n)) {
            ans = 0;
        }
        for (char i : "753".toCharArray()) {
            ans += aaa(n + i - '0');
        }
        return ans;
    }

    public static boolean isPerfect(int n) {
        Set<Character> set = new HashSet<>();
        while (n > 0) {
            set.add((char) (n % 10 + '0'));
            n /= 10;
        }
        return set.contains('7') && set.contains('5') && set.contains('3');
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
public class MainTest {
    @Test
    public void test1() {
        int N = 3333333357;
        assertEquals(8335, aaa(N));
    }

    @Test
    public void test2() {
        int N = 123456789;
        assertEquals(0, aaa(N));
    }

    @Test
    public void test3() {
        int N = 987654321;
        assertEquals(0, aaa(N));
    }

    @Test
    public void test4() {
        int N = 12345678;
        assertEquals(1, aaa(N));
    }
}
```<|endoftext|>
