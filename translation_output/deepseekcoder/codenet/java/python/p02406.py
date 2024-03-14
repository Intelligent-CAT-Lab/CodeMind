<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
import sys

def main():
    x = int(sys.stdin.readline())
    sb = []
    count = 0
    a = 1
    if 3 <= x <= 10000:
        while count < x:
            b = a // 10
            if a % 3 == 0:
                sb.append(" ")
                sb.append(a)
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        sb.append(" ")
                        sb.append(a)
                        break
                    b //= 10
            a += 1
            count += 1
    print(''.join(map(str, sb)))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it's within the specified range, and then iterates from 1 to that number. For each number, it checks if it's divisible by 3 or if it contains the digit 3. If either condition is true, it appends the number to a list. Finally, it prints out the numbers in the list, separated by spaces.
<|EOT|>
