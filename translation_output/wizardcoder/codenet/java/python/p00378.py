Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
        A = int(input())
        B = int(input())
        X = int(input())

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

- We first import the java.util package to use the Scanner class.
- We define a class named p00378 which contains a method named solve().
- Inside the solve() method, we declare and initialize variables A, B, X, ans, and sc.
- We create a Scanner object named sc to read input from the user.
- We check if X is not divisible by 500, and if it is not, we add 500 to it to make it divisible by 500.
- We initialize variables a and b to 0.
- We check the conditions mentioned in the problem statement and update the values of a and b accordingly.
- We print the final answer by multiplying A and a and adding B and b.
- We define a main() method which creates an object of the p00378 class and calls its solve() method.<|endoftext|>
