Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import java.util.Scanner;

class p02694:

    def main(self):
        stdIn = Scanner(System.in)

        x = stdIn.nextLong()
        count = 0

        a = 100
        while True:
            if a >= x:
                break
            a = a + a/100
            count += 1

        System.out.println(count)

p02694().main()
```<|endoftext|>
