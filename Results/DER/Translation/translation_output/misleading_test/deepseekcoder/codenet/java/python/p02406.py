<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
import sys

def main(x):
    count = 0
    a = 1
    result = []
    if 3 <= x <= 10000:
        while count < x:
            b = a // 10
            if a % 3 == 0:
                result.append(a)
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        result.append(a)
                        break
                    b = b // 10
            a += 1
            count += 1
    return result

if __name__ == "__main__":
    x = int(sys.stdin.readline())
    print(*main(x))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it's within the specified range, and then generates the specified number of integers that either are divisible by 3 or contain the digit 3. The results are printed to the standard output.
<|EOT|>
