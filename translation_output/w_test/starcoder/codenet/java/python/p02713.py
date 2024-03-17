<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
9


```
import java.util.*;

public class p02713{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        int result = 0;
        int a = 0;

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                a =gcd(i, j);
                for(int k=1; k<=N; k++){
                    result += gcd(a, k);
                }
            }
        }
        System.out.println(result);
    }

    public static int gcd(int p, int q){
        if(p % q == 0){
            return q;
        }
        return gcd(q, p%q);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def gcd(p, q):
    if p % q == 0:
        return q
    return gcd(q, p%q)

def main():
    N = int(sys.stdin.readline())
    result = 0
    a = 0
    for i in range(1, N+1):
        for j in range(1, N+1):
            a = gcd(i, j)
            for k in range(1, N+1):
                result += gcd(a, k)
    print(result)

if __name__ == "__main__":
    main()
```
<|endoftext|>
