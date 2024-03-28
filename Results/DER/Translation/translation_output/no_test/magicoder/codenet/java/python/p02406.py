<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    x = int(sys.stdin.readline())
    sb = ""
    count = 0
    a = 1
    if x >= 3 and x <= 10000:
        while count < x:
            b = a // 10
            if a % 3 == 0:
                sb += " " + str(a)
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        sb += " " + str(a)
                        break
                    b //= 10
            a += 1
            count += 1
    print(sb)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it's within the specified range, and then generates a string of numbers that are divisible by 3 or contain the digit 3. The generated string is then printed to the standard output.<｜end▁of▁sentence｜>
