<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
import sys

def main():
    s = sys.stdin.readline().strip()
    array = list(s)

    for i in range(0, len(s), 2):
        print(array[i], end='')

if __name__ == "__main__":
    main()
```
<|EOT|>
