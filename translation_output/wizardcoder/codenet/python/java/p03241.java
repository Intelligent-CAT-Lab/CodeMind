Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MN = M/N;
        int[] divisor = makeDivisors(M);
        int max_gcd = 0;
        for (int i = 0; i < divisor.length; i++) {
            if (divisor[i] <= MN && divisor[i] >= max_gcd) {
                max_gcd = divisor[i];
            }
        }
        System.out.println(max_gcd);
    }

    public static int[] makeDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i!= n / i) {
                    divisors.add(n / i);
                }
            }
        }
        int[] result = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            result[i] = divisors.get(i);
        }
        return result;
    }
}
```<|endoftext|>
