Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02124{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "ai1333";
		int x = sc.nextInt();
		for(int i=0;i<x/100;i++) {
			ans += "3";
		}
		System.out.println(ans);
	}
}

```

### Response:
```python
import java.util.Scanner;

public class p02124:
    def main(args):
        sc = Scanner(System.in)
        ans = "ai1333"
        x = sc.nextInt()
        for i in range(x//100):
            ans += "3"
        print(ans)
```<|endoftext|>
