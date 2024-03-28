<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
103

Expected output:
3


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

python code:<fim_suffix><fim_middle>

```python
import sys

x = int(sys.stdin.readline())
count = 0

a = 100
while True:
    if a >= x:
        break
    a = a + a / 100
    count += 1

print(count)
```
<|endoftext|>
