<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
```python
import sys

def p02406():
    n = int(input())
    sb = StringBuilder()
    count = 0
    a = 1
    if 3 <= n <= 10000:
        while count < n:
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
    print(sb)

if __name__ == "__main__":
    p02406()
```</s>
