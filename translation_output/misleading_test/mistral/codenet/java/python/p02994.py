<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2

Expected output:
-35

```
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p02994 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();

        List<Integer> diff = new ArrayList<Integer>();
        
        for(int i = 1; i < n+1; i++) {
          int value = l+i-1;
          if(value < 0) {
            value = value * -1;
          }
          diff.add(value);
          }
        
        Integer removeK = diff.indexOf(Collections.min(diff)) + 1;
        
        
        System.out.println(n*l + n*(n+1)/2 - n - (l+ removeK -1));
    }
}
```
[/INST]
```python
n, l = map(int, input().split())
diff = [l + i - 1 for i in range(1, n+1)]
diff.append(0)
removeK = diff.index(min(diff)) + 1
print(n*l + n*(n+1)//2 - n - (l+ removeK -1))
```</s>
