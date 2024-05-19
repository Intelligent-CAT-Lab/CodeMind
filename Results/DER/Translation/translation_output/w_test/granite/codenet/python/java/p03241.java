System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 14

Expected output:
2


```
def make_divisors(n):
    divisors = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            divisors.append(i)
            if i!= n // i:
                divisors.append(n//i)

    # divisors.sort()
    return divisors

def main():
    N, M = map(int, input().split())
    MN = M/N
    divisor = make_divisors(M)
    max_gcd = 0
    for d in divisor:
        if (d<=MN) and (d>=max_gcd):
            max_gcd = d
    print(max_gcd)
if __name__ == '__main__':
    main()
```


Answer:
```java
import java.util.*;

public class Main {
    public static List<Integer> makeDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i!= n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        double MN = (double) M / N;
        List<Integer> divisors = makeDivisors(M);
        int maxGcd = 0;
        for (int d : divisors) {
            if (d <= MN && d >= maxGcd) {
                maxGcd = d;
            }
        }
        System.out.println(maxGcd);
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMakeDivisors() {
        assertEquals(Arrays.asList(1, 2, 3, 6), makeDivisors(6));
        assertEquals(Arrays.asList(1, 2, 4, 8, 16), makeDivisors(16));
        assertEquals(Arrays.asList(1, 3, 9), makeDivisors(9));
    }

    @Test
    public void testMain() {
        Main.main(new String[]{"3", "14"});
    }
}
```<|endoftext|>
