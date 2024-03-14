<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MN = M/N;
        int[] divisors = new int[M];
        int max_gcd = 0;
        for(int i=1;i<=M;i++){
            if(M%i==0){
                divisors[i-1] = i;
            }
        }
        for(int i=0;i<divisors.length;i++){
            if(divisors[i]<=MN && divisors[i]>=max_gcd){
                max_gcd = divisors[i];
            }
        }
        System.out.println(max_gcd);
    }
}
```
<|endoftext|>
