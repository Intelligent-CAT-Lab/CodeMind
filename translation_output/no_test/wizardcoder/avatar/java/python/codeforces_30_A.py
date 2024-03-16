Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import java.math.BigInteger
import java.util.Scanner

def main():
    in = Scanner(System.in)
    A = in.nextInt()
    B = in.nextInt()
    N = in.nextInt()
    bigA = BigInteger.valueOf(A)
    bigB = BigInteger.valueOf(B)
    
    for x in range(-1000, 1001):
        if BigInteger.valueOf(x).pow(N).multiply(bigA).equals(bigB):
            print(x)
            return
    
    print("No solution")

if __name__ == '__main__':
    main()
```

Note: The `BigInteger` class in Java is replaced by the `java.math.BigInteger` module in Python. Also, the `Scanner` class in Java is replaced by the `java.util.Scanner` module in Python.<|endoftext|>
