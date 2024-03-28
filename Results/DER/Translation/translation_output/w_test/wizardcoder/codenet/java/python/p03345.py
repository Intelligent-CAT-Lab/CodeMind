Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 1

Expected output:
1


```
import java.util.Scanner;

public class p03345 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a  = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long ans = a-b;
		if(Math.abs(ans)>Math.pow(10, 18)) {
			System.out.println("Unfair");
			return;
		}
		if(k%2 == 0) {
			System.out.println(ans);
		}
		else {
			System.out.println(ans*-1);
		}
	}
}

```

### Response:
```python
import math

def main():
    a, b, c, k = map(int, input().split())
    ans = a - b
    if abs(ans) > math.pow(10, 18):
        print("Unfair")
        return
    if k % 2 == 0:
        print(ans)
    else:
        print(-ans)

if __name__ == '__main__':
    main()
```

Explanation:

- We first import the `math` module to use the `pow()` function.
- We define a function `main()` which takes input from the user using the `input()` function and converts it into integers using the `map()` function.
- We calculate the difference between `a` and `b` and store it in the variable `ans`.
- We check if the absolute value of `ans` is greater than `10^18` using the `abs()` function and `math.pow()` function. If it is, we print "Unfair" and return from the function.
- If `k` is even, we print `ans`. Otherwise, we print `-ans` (since we want to find the minimum value).
- Finally, we call the `main()` function to run the program.<|endoftext|>
