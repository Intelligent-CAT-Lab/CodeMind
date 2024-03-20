Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5700

Expected output:
5505

```
import java.util.*;

public class p02137 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		System.out.println(p / 500 * 500);
	}
}


```

### Response:
```python
p = int(input())
print(p // 500 * 500)
```

Explanation:
- We first import the `java.util` package to use the `Scanner` class.
- We then create a `Scanner` object to read input from the user.
- We read an integer `p` from the user using the `nextInt()` method of the `Scanner` class.
- We calculate the floor division of `p` by 500 using the `//` operator and store the result in `p`.
- We then multiply `p` by 500 to get the nearest multiple of 500.
- Finally, we print the result using the `println()` method of the `System.out` object.<|endoftext|>
