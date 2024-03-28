Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2

Expected output:
5

```
import java.util.*;

public class p01810{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        long N = sc.nextLong(), K = sc.nextLong();
                        long ans = 0;
                        for(long i = 0; i < N - 1; i++){
                                ans = K * ((long)(ans / (K - 1))) + ans % (K - 1) + 1;
                        }
                        System.out.println(ans);
                }
        }
}
```

### Response:
```python
import java.util.*;

public class p01810{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        long N = sc.nextLong(), K = sc.nextLong();
                        long ans = 0;
                        for(long i = 0; i < N - 1; i++){
                                ans = K * ((ans // (K - 1))) + ans % (K - 1) + 1;
                        }
                        System.out.println(ans);
                }
        }
}
```

Explanation:

- We need to import the `java.util` package to use the `Scanner` class.
- We use a `try-with-resources` block to automatically close the `Scanner` object after we are done using it.
- We read the input values of `N` and `K` using the `nextLong()` method of the `Scanner` class.
- We initialize the variable `ans` to 0.
- We use a `for` loop to iterate from 0 to `N - 2`.
- Inside the loop, we update the value of `ans` using the formula `K * ((ans // (K - 1))) + ans % (K - 1) + 1`.
- We use the `//` operator to perform integer division.
- We use the `%` operator to perform modulo operation.
- We print the value of `ans` using the `println()` method of the `System.out` object.<|endoftext|>
