<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
x = int(input())
a = 1
b = 0
while a <= x:
    b = a/10
    if a%3 == 0:
        print(a, end=' ')
    else:
        if b%10 == 3:
            print(a, end=' ')
    a += 1
```
<|endoftext|>
