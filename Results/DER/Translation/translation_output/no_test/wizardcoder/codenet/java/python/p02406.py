Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
    def main(self, args):
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

p02406().main(None)
```

Explanation:

- We first import the necessary classes from the java.io package.
- We define a class named `p02406` which contains a method named `main` which takes in a list of arguments.
- Inside the `main` method, we create a `BufferedReader` object to read input from the user and a `StringBuilder` object to store the output.
- We then read the input integer `x` from the user and initialize the variables `count`, `a`, and `b` to 0.
- We check if `x` is between 3 and 10000 (inclusive) and if it is, we proceed with the loop.
- Inside the loop, we calculate the last digit of `a` using integer division (`//`) and store it in `b`.
- If `a` is divisible by 3, we append a space and `a` to the `StringBuilder` object.
- Otherwise, we initialize `b` to `a` and then loop through the digits of `a` until we find a digit that is equal to 3.
- Once we find the digit, we append a space and `a` to the `StringBuilder` object and break out of the loop.
- We then increment `a` and `count` and continue the loop until `count` is equal to `x`.
- Finally, we print the contents of the `StringBuilder` object to the console.<|endoftext|>
