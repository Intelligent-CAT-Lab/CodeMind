System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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
            ans += aaa(n + Character.getNumericValue(i));
        }
        return ans;
    }

    public static boolean isPerfect(int n) {
        Set<Character> set = new HashSet<>();
        while (n > 0) {
            set.add(String.valueOf(n % 10).charAt(0));
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
        Main.N = 3333333357;
        assertEquals(8307, Main.aaa(0));
    }

    @Test
    public void test2() {
        Main.N = 1234567890;
        assertEquals(0, Main.aaa(123456789));
    }

    @Test
    public void test3() {
        Main.N = 1234567890;
        assertEquals(1, Main.aaa(0));
    }
}
```<|endoftext|>
