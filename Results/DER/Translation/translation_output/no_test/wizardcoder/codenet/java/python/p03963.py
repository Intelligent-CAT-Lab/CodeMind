Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03963{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = K;
        for(int i=2;i<=N;i++){
            ans *= K-1;
        }
        System.out.println(ans);
    }
}

```

### Response:
```python
import java.util.*;

class p03963:
    def main(self):
        sc = Scanner(System.in)
        N = sc.nextInt()
        K = sc.nextInt()
        ans = K
        for i in range(2, N+1):
            ans *= K-1
        print(ans)

p03963().main()
```

Explanation:

- We first import the `java.util` package to use the `Scanner` class.
- We define a class `p03963` which contains a method `main` which is the entry point of the program.
- Inside the `main` method, we create a new instance of the `Scanner` class and read two integers `N` and `K` from the standard input using the `nextInt` method.
- We initialize the variable `ans` to `K` as it is the answer to the problem.
- We use a `for` loop to iterate from `2` to `N` and multiply `ans` by `(K-1)` for each iteration.
- Finally, we print the value of `ans` using the `print` function.<|endoftext|>
