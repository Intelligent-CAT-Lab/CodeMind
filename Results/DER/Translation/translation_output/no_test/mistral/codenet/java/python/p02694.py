<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def p02694():
    x = int(input())
    count = 0

    a = 100
    while True:
        if a >= x:
            break
        a = a + a // 100
        count += 1

    print(count)

if __name__ == "__main__":
    p02694()
```</s>
