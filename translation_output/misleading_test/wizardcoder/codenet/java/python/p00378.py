Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
180 100 2400

Expected output:
509

```
import java.util.*;
class p00378{
    void solve(){
        int A, B, X, ans;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        X = sc.nextInt();

        if ( X % 500!= 0 ) X += 500 - X%500;
        int a = 0;
        int b = 0;

        if ( A < B ) {
            a = X/1000 + ((X%1000>0)?1:0);
        } else if ( A > 2*B ){
            b = X/500;
        } else {
            a = X/1000; X %= 1000;
            b = X/500;
        }

        System.out.println(A*a + B*b);
    }

    public static void main(String[] args){ new p00378().solve(); }
}


```

### Response:
```python
import java.util.*;

class p00378:
    def solve(self):
        sc = Scanner(System.in)
        A = sc.nextInt()
        B = sc.nextInt()
        X = sc.nextInt()

        if X % 500!= 0:
            X += 500 - X % 500

        a = 0
        b = 0

        if A < B:
            a = X // 1000 + (X % 1000 > 0)
        elif A > 2 * B:
            b = X // 500
        else:
            a = X // 1000
            X %= 1000
            b = X // 500

        print(A * a + B * b)

    def main(self):
        self.solve()

p00378().main()
```

Explanation:

- We first import the necessary classes from the java.util package.
- We define a class `p00378` which contains a method `solve()` which reads the input values from the user and performs the required calculations.
- We create a `Scanner` object to read input values from the user.
- We read the values of A, B, and X from the user using the `nextInt()` method of the `Scanner` class.
- We check if X is not divisible by 500. If it is not, we add 500 to it to make it divisible by 500.
- We initialize variables `a` and `b` to 0.
- We check the conditions mentioned in the problem statement to determine the values of `a` and `b`.
- We print the final answer by multiplying A and `a` and adding B and `b`.<|endoftext|>
