Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
class p03359{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt(); 
        if(b>=a){
            System.out.println(a);
        }else{
            System.out.println(a-1);
        }
    }
}
```

### Response:
```python
import java.util.Scanner;

class p03359:
    def main(self):
        scn = Scanner(System.in)
        a = scn.nextInt()
        b = scn.nextInt()
        if b >= a:
            print(a)
        else:
            print(a-1)
```<|endoftext|>
