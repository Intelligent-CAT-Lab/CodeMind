<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2

Expected output:
18


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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    n, l = map(int, sys.stdin.readline().split())
    diff = []
    for i in range(1, n+1):
        value = l+i-1
        if value < 0:
            value = value * -1
        diff.append(value)
    removeK = diff.index(min(diff)) + 1
    print(n*l + n*(n+1)/2 - n - (l+ removeK -1))

if __name__ == "__main__":
    main()
```
<|endoftext|>
