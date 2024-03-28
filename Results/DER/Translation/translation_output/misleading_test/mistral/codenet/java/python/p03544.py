<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
-20

```
import java.util.*;
public class p03544{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] num = new long[100];

        for(int i =0;i<100;i++){
            if(i==0){
                num[i]=2;
            }else if(i==1){
                num[i]=1;
            }else{
            num[i] = num[i-1]+num[i-2];
        }
    }

        System.out.println(num[n]);
        

    }
}


```
[/INST]
```python
n = int(input())
num = [0] * 100
num[0], num[1] = 2, 1
for i in range(2, 100):
    num[i] = num[i-1] + num[i-2]
print(num[n])
```</s>
