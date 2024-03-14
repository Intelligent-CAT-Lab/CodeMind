Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Scanner

def main():
    scanner = Scanner(System.in)
    n = scanner.nextInt()
    l = scanner.nextInt()

    diff = ArrayList()
    
    for i in range(1, n+1):
        value = l+i-1
        if value < 0:
            value = value * -1
        diff.add(value)
        
    removeK = diff.indexOf(Collections.min(diff)) + 1
    
    print(n*l + n*(n+1)//2 - n - (l+ removeK -1))

if __name__ == '__main__':
    main()
```

Note:
- We need to use `//` instead of `/` for integer division in Python.
- We need to use `ArrayList` instead of `List` in Python.
- We need to use `Scanner` instead of `Scanner` in Python.
- We need to use `System.out.println()` instead of `print()` in Python.<|endoftext|>
