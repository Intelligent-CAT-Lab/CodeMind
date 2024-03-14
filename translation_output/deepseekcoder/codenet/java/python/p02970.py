<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class p02970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = Integer.parseInt(sc.next());
		final int D = Integer.parseInt(sc.next());

		BigDecimal ans = BigDecimal.valueOf(N / (D * 2 + 1.0));
		ans =  ans.setScale(0, RoundingMode.CEILING);
		System.out.println(ans);


	}

}

```

### Response:
```python
import math

def main():
    N, D = map(int, input().split())
    ans = N / (D * 2 + 1.0)
    ans = math.ceil(ans)
    print(int(ans))

if __name__ == "__main__":
    main()
```
<|EOT|>
