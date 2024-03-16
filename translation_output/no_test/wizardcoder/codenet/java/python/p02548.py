Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.math.BigInteger;
import java.util.Scanner;

public class p02548 {
	public static void main(String[] args) {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger cnt = BigInteger.ZERO;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i * j < n) {
					cnt = cnt.add(BigInteger.ONE);
				} else {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}

```

### Response:
```python
import java.math.BigInteger
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    n = sc.nextInt()
    cnt = BigInteger.ZERO
    for i in range(1, n+1):
        for j in range(1, n+1):
            if i*j < n:
                cnt = cnt.add(BigInteger.ONE)
            else:
                break
    print(cnt)

if __name__ == '__main__':
    main()
```

Explanation:

- We import the necessary classes from the java package.
- We define a function `main()` that reads the input from the user and prints the output.
- We create a `Scanner` object to read input from the user.
- We read the value of `n` from the user using the `nextInt()` method of the `Scanner` class.
- We initialize a `BigInteger` object `cnt` to `0`.
- We use two nested `for` loops to iterate over all possible pairs of `i` and `j` such that `i*j < n`.
- Inside the inner loop, we check if `i*j < n`. If it is, we increment the value of `cnt` by `1`.
- If `i*j >= n`, we break out of the inner loop.
- Finally, we print the value of `cnt`.<|endoftext|>
