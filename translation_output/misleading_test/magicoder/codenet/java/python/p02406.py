<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    x = int(sys.stdin.readline())
    count = 0
    a = 1
    result = []
    if x >= 3 and x <= 10000:
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
                    b //= 10
            a += 1
            count += 1
    print(*result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it's within the specified range, and then generates the sequence of numbers. If the number is divisible by 3, it's appended to the result list. If not, it checks each digit of the number to see if it's 3. If it is, the number is appended to the result list. The process continues until the desired length of the sequence is reached. The result list is then printed to the standard output.<｜end▁of▁sentence｜>
