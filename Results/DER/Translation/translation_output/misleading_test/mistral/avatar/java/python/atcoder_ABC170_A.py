<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 0

Expected output:
35

```
import java.util.*;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anser = 0;
        int[] count = new int[5];
        
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            count[i] += x;
            
            if (count[i] == 0) {
                anser = i;
            }
        }
        
        System.out.println(anser + 1);
    }
}
```
[/INST]
```python
import sys

def main():
    n = int(input())
    count = [0] * 5
    for i in range(5):
        x = int(input())
        count[i] += x
        if count[i] == 0:
            ans = i
    print(ans + 1)

if __name__ == "__main__":
    main()
```</s>
