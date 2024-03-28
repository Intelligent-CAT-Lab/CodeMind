<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    x = int(sys.stdin.readline())
    if x < 3 or x > 10000:
        return
    sb = []
    a = 1
    while a <= x:
        b = a // 10
        if a % 3 == 0:
            sb.append(str(a))
        else:
            while b > 0:
                if b % 10 == 3:
                    sb.append(str(a))
                    break
                b //= 10
        a += 1
    print(" ".join(sb))

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `sys` module to read input from stdin, and the `//` operator to perform integer division. The `//` operator is used instead of the `/` operator to ensure that the result is an integer. The `join` method is used to concatenate the elements of the list `sb` into a single string, with spaces between them.</s>
