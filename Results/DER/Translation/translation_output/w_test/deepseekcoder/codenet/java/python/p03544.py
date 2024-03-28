<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
11


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

### Response:
```python
def p03544(n):
    num = [0]*100
    for i in range(100):
        if i == 0:
            num[i] = 2
        elif i == 1:
            num[i] = 1
        else:
            num[i] = num[i-1] + num[i-2]
    return num[n]

n = int(input())
print(p03544(n))
```

This Python code does the same thing as the Java code. It initializes an array of 100 elements with the first two elements set to 2 and 1 respectively. Then it fills the rest of the array with the sum of the previous two elements. Finally, it prints the nth element of the array.
<|EOT|>
