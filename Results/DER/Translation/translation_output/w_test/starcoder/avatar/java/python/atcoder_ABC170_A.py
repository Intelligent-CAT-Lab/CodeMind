<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 0

Expected output:
5


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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    input = sys.stdin.readline
    N = list(map(int, input().split()))
    count = [0] * 5
    for i in N:
        count[i - 1] += 1
    for i in range(5):
        if count[i] == 0:
            print(i + 1)
            return

if __name__ == '__main__':
    main()
```

'''
<|endoftext|>
