<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
# Sample test case
tail = "000"

# Expected output
print(len(tail) - tail.count("0"))

# Python implementation
n = len(tail)
tailsp = tail.split()
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
```</s>
