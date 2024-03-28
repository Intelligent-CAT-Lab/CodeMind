Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000000


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

- We first import the `java.util.Scanner` class to read input from the user.
- We define a `main()` function that reads the input from the user using the `Scanner` class.
- We then read the values of `n` and `k` from the user using the `nextInt()` method of the `Scanner` class.
- We calculate the result of `(n / k + 1) * k` using integer division and the `*` operator.
- Finally, we print the result using the `print()` function.<|endoftext|>
