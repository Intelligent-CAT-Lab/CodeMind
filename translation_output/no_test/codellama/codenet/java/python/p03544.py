<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```python
import sys

n = int(sys.stdin.readline())
num = [0] * 100

for i in range(100):
    if i == 0:
        num[i] = 2
    elif i == 1:
        num[i] = 1
    else:
        num[i] = num[i-1] + num[i-2]

print(num[n])
```
This is the Python code equivalent to the given Java code. The `sys` module is used to read input from the standard input stream, and the `range` function is used to iterate over the indices of the `num` array. The `if` statements are used to set the initial values of the `num` array, and the `else` clause is used to calculate the values of the array using the recurrence relation. Finally, the `print` function is used to print the value of the `num` array at the specified index.</s>
