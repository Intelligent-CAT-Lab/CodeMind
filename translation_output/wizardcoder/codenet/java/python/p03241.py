Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;public class p03241{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int m=s.nextInt();for(int i=m/n;true;i--)if(m%i==0){System.out.print(i);break;}}}

```

### Response:
```python
import java.util.*;

public class p03241{
    public static void main(String[]a){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        for(int i=m/n;true;i--){
            if(m%i==0){
                System.out.print(i);
                break;
            }
        }
    }
}
```<|endoftext|>
