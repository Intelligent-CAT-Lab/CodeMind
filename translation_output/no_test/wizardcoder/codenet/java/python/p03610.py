Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03610{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");

        for(int i = 0; i < s.length(); i += 2){
            System.out.print(array[i]);
        }
        
    }
}
```

### Response:
```python
import java.util.*;

class p03610:
    def main(self):
        sc = Scanner(System.in)
        s = sc.next()
        array = s.split("")

        for i in range(0, s.length(), 2):
            System.out.print(array[i])
```<|endoftext|>
