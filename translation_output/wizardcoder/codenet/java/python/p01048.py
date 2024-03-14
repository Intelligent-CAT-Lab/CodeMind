Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01048 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] ans = {0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60};
		int i = sc.nextInt();

		System.out.println(ans[i]);
	}

}

```

### Response:
```python
import java.util.Scanner

public class p01048:

    def main(args):
        sc = Scanner(System.in)
        ans = [0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60]
        i = sc.nextInt()

        System.out.println(ans[i])

```<|endoftext|>
