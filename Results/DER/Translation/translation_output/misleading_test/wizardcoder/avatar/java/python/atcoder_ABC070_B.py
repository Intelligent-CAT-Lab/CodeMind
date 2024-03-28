Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 50 50 100

Expected output:
-21

```
import java.util.*;

public class atcoder_ABC070_B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] array = new int[101];
        
        for (int i = a; i < b; i++) {
            array[i]++;
        }
        
        for (int i = c; i < d; i++) {
            array[i]++;
        }
        
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            if (array[i] == 2) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```

### Response:
```python
import sys

def main():
    input = sys.stdin.readline().strip().split()
    a, b, c, d = map(int, input)
    array = [0] * 101
    
    for i in range(a, b):
        array[i] += 1
    
    for i in range(c, d):
        array[i] += 1
    
    ans = 0
    for i in range(101):
        if array[i] == 2:
            ans += 1
    
    print(ans)

if __name__ == '__main__':
    main()
```<|endoftext|>
