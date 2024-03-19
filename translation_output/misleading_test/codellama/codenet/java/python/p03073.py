<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
000

Expected output:
2

```

import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class p03073 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String tail = sc.next();
        int n = tail.length();//æ¡æ°
        String[] tailsp = tail.split("");
        String zero= "0";
        String one ="1";
        int count=0;
        for(int i=0;i<n;i++){
            if(i%2==0&&tailsp[i].equals(zero)){
                count ++;
            }
            if(i%2==1&&tailsp[i].equals(one)){
                count ++;
            }
        }
        n -=count;
        if(count > n){
            System.out.print(n);
        }else{
            System.out.print(count);
        }
        
    }
    
}
```
[/INST]
```python
import sys

def main():
    tail = sys.stdin.readline().strip()
    n = len(tail)
    tailsp = tail.split("")
    zero = "0"
    one = "1"
    count = 0
    for i in range(n):
        if i % 2 == 0 and tailsp[i] == zero:
            count += 1
        if i % 2 == 1 and tailsp[i] == one:
            count += 1
    n -= count
    if count > n:
        print(n)
    else:
        print(count)

if __name__ == "__main__":
    main()
```
Note that the code is written in Python 3.x, and it uses the `sys` module to read input from stdin. The `strip()` method is used to remove any trailing newline characters from the input string. The `split()` method is used to split the input string into a list of individual characters. The `range()` function is used to iterate over the indices of the list, and the `if` statements are used to check if the current index is even or odd, and if the corresponding character is a zero or one. The `count` variable is used to keep track of the number of characters that are either even or odd, depending on the current index. Finally, the `print()` function is used to output the result.</s>
