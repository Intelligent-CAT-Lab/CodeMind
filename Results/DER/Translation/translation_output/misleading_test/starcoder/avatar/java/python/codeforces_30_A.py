<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 896 7

Expected output:
13

```
import java.math.BigInteger;
import java.util.Scanner;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int N = in.nextInt();
        BigInteger bigA = BigInteger.valueOf(A);
        BigInteger bigB = BigInteger.valueOf(B);
        
        for (int x = -1000; x <= 1000; x++) {
            if (BigInteger.valueOf(x).pow(N).multiply(bigA).equals(bigB)) {
                System.out.println(x);
                return;
            }
        }
        
        System.out.println("No solution");
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import java.math.BigInteger;
import java.util.Scanner;

def main():
    in = Scanner(System.in)
    A = in.nextInt()
    B = in.nextInt()
    N = in.nextInt()
    bigA = BigInteger.valueOf(A)
    bigB = BigInteger.valueOf(B)
    
    for x in range(-1000, 1000):
        if (BigInteger.valueOf(x).pow(N).multiply(bigA).equals(bigB)):
            print(x)
            return
    print("No solution")

if __name__ == "__main__":
    main()
```

'''
<|endoftext|>
