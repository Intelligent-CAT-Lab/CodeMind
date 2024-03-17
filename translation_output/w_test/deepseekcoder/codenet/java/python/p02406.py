<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
import sys

def find_numbers(x):
    if x >= 3 and x <= 10000:
        numbers = []
        for a in range(1, x+1):
            if a % 3 == 0 or '3' in str(a):
                numbers.append(a)
        return numbers

if __name__ == "__main__":
    x = int(sys.stdin.readline())
    numbers = find_numbers(x)
    print(*numbers)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, generates a list of numbers from 1 to that integer, and then filters out the numbers that are divisible by 3 or contain the digit 3. The filtered numbers are then printed to the standard output.
<|EOT|>
