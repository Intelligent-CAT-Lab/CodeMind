<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    tail = sys.stdin.readline().strip()
    n = len(tail)
    tail_list = list(tail)
    zero = "0"
    one = "1"
    count = 0
    for i in range(n):
        if i % 2 == 0 and tail_list[i] == zero:
            count += 1
        elif i % 2 == 1 and tail_list[i] == one:
            count += 1
    n -= count
    if count > n:
        print(n)
    else:
        print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the number of "0"s and "1"s at even and odd positions, and then prints the smaller of the two counts.
<|EOT|>
