<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p02694 {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long x=stdIn.nextLong();
        int count=0;

        long a=100;
        while(true){
            if(a>=x){
                break;
            }
            a=a+a/100;
            count++;
        }
        System.out.println(count);
        
    }

}
```

### Response:
```python
import sys

def main():
    x = int(sys.stdin.readline())
    count = 0

    a = 100
    while True:
        if a >= x:
            break
        a = a + a // 100
        count += 1
    print(count)

if __name__ == "__main__":
    main()
```
<|EOT|>
