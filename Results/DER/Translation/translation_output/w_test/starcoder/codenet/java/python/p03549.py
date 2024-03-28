<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3800


```
import java.util.*;

public class p03549 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();

    sc.close();

    int X = 1900 * M + 100 * (N - M);

    int rate = 1;

    for (int i = 1; i <= M; i++){
      rate *= 2;
    }

    System.out.println(rate * X);

  }

}
```

python code:<fim_suffix><fim_middle>

```python
import sys

N, M = map(int, sys.stdin.readline().split())

print(1900 * M + 100 * (N - M))
```
<|endoftext|>
