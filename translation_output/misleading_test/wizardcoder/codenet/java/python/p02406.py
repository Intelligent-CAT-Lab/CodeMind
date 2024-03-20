Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
30

Expected output:
44 37 109 62 -37 60 101 -5 19 106 19 58

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
```<|endoftext|>
