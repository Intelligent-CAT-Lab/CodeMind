Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
30

Expected output:
 3 6 9 12 13 15 18 21 23 24 27 30


```
import java.io.*;
   
class p02406{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int count=0;
        int a=1,b;
        if(x>=3 && x<=10000){
            for(; count<x; count++){
                 b = a/10;
                    if(a%3==0){
                        sb.append(" ");
                        sb.append(a);
                    }else{
                        b = a;
                        while(b!=0){
                            if(b%10==3){
                                sb.append(" ");
                                sb.append(a);
                                break;
                            }
                            b /= 10;
                        }
                    }
                    a++;
            }
        }
        System.out.println(sb);
    }
}
```

### Response:
```python
import java.io.*;

class p02406:
    def main(self):
        br = BufferedReader(InputStreamReader(System.in))
        x = int(br.readLine())
        sb = StringBuilder()
        count = 0
        a = 1
        b = 0
        if x>=3 and x<=10000:
            while count<x:
                b = a//10
                if a%3==0:
                    sb.append(" ")
                    sb.append(a)
                else:
                    b = a
                    while b!=0:
                        if b%10==3:
                            sb.append(" ")
                            sb.append(a)
                            break
                        b //= 10
                a += 1
                count += 1
        System.out.println(sb)

p02406().main()
```

Explanation:

- We first import the necessary classes from the java.io package.
- We define a class `p02406` which contains a `main` method.
- Inside the `main` method, we create a `BufferedReader` object to read input from the user.
- We read the input integer `x` from the user and store it in the variable `x`.
- We create a `StringBuilder` object to store the output.
- We initialize the variables `count`, `a`, and `b` to 0, 1, and 0 respectively.
- We check if the input integer `x` is within the range of 3 to 10000.
- We use a `while` loop to iterate until we have printed `x` numbers.
- Inside the loop, we calculate the last digit of `a` using integer division and store it in the variable `b`.
- If `a` is divisible by 3, we append a space and `a` to the `StringBuilder` object.
- Otherwise, we initialize `b` to `a` and use a `while` loop to iterate until we find the digit 3 in `b`.
- If we find the digit 3, we append a space and `a` to the `StringBuilder` object and break out of the loop.
- We increment `a` by 1 and `count` by 1.
- After the loop, we print the `StringBuilder` object.<|endoftext|>
