<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    x = int(sys.stdin.readline())
    sb = []
    count = 0
    a = 1
    while count < x:
        b = a // 10
        if a % 3 == 0:
            sb.append(str(a))
        else:
            while b != 0:
                if b % 10 == 3:
                    sb.append(str(a))
                    break
                b //= 10
        a += 1
        count += 1
    print(" ".join(sb))

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `//` operator for integer division, which is equivalent to the Java code's `b = a / 10` statement. The `//` operator returns the integer part of the result, which is equivalent to the Java code's `b = a / 10` statement.

Also, the Python code uses the `str()` function to convert the integer `a` to a string, which is equivalent to the Java code's `sb.append(String.valueOf(a))` statement.

Finally, the Python code uses the `join()` method to join the elements of the `sb` list with a space character, which is equivalent to the Java code's `System.out.println(sb)` statement.</s>
