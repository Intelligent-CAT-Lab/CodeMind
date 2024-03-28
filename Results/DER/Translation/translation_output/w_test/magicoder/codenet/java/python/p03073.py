<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
000

Expected output:
1


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

@@ Response
```python
# Python code

def count_zeros_and_ones(tail):
    n = len(tail)
    tailsp = list(tail)
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
        return n
    else:
        return count

tail = input()
print(count_zeros_and_ones(tail))
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the number of zeros and ones in the string, and then returns the smaller of the two counts.<｜end▁of▁sentence｜>
