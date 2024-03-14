Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.Scanner;

public class p03073 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tail = sc.next();
        int n = tail.length();
        String[] tailsp = tail.split("");
        String zero = "0";
        String one = "1";
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 and tailsp[i].equals(zero)) {
                count++;
            }
            if (i % 2 == 1 and tailsp[i].equals(one)) {
                count++;
            }
        }
        n -= count;
        if (count > n) {
            System.out.print(n);
        } else {
            System.out.print(count);
        }
    }
}
```<|endoftext|>
