<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p02639 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            x[i] = sc.nextInt();
            sum += x[i];
        }
        System.out.println(15-sum);
    }

}


Translate the above java code to python.

python code:

[/INST]
```
import sys

x = [int(i) for i in sys.stdin.readline().split()]
sum = 0
for i in range(5):
    sum += x[i]
print(15 - sum)
```
This code reads the input from the user and stores it in a list called `x`. It then calculates the sum of the elements in the list and prints the difference between 15 and the sum.

Note that in Python, we use `sys.stdin.readline()` to read a line of input from the user, and `split()` to split the line into a list of strings. We then use a list comprehension to convert the list of strings to a list of integers.</s>
