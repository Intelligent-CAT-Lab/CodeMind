System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4 5

Expected output:
6


```
import java.util.Scanner;

/**
 *
 * @author kouki
 */
public class p03145 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        
        System.out.println((x*y)/2);
        
    }
    
}
```


Answer:
```python
import sys

def main():
    x, y, z = map(int, sys.stdin.readline().split())
    print((x * y) // 2)

if __name__ == "__main__":
    main()
```

Test input:
```
3 4 5
```

Expected output:
```
6
```<|endoftext|>
