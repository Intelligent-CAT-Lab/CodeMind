Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000087

```
public class codeforces_678_A {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        System.out.println((n / k + 1) * k);
    }
}
```

### Response:
```python
import java.util.Scanner

def main():
    input = Scanner(System.in)
    n = input.nextInt()
    k = input.nextInt()
    
    print((n // k + 1) * k)

if __name__ == '__main__':
    main()
```

Explanation:

- We first import the `java.util.Scanner` class from the `java.util` package.
- We define a `main()` function that takes no arguments.
- Inside the `main()` function, we create a new `Scanner` object to read input from the standard input stream.
- We read two integers `n` and `k` from the input stream using the `nextInt()` method of the `Scanner` class.
- We compute the result of the expression `(n / k + 1) * k` using integer division and the `*` operator.
- We print the result to the standard output stream using the `println()` method of the `System.out` object.
- Finally, we call the `main()` function to run the program.<|endoftext|>
