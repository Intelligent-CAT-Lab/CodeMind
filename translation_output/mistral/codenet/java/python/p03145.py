<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def main():
    x = int(input())
    y = int(input())
    z = int(input())
    
    print((x*y)/2)

if __name__ == "__main__":
    main()
```</s>
