<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import math

N = int(input())
D = int(input())

ans = math.ceil(N / (D * 2 + 1))
print(ans)
```</s>
