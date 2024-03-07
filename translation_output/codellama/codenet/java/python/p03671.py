<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p03671{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] sum = {a,b,c};
        Arrays.sort(sum);

        System.out.println(sum[0]+sum[1]);
    }

}


Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b, c = map(int, sys.stdin.readline().split())

sum = [a, b, c]
sum.sort()

print(sum[0] + sum[1])
```
In this code, we first read the input from the user using `sys.stdin.readline()` and split it into three integers using `split()`. We then create a list called `sum` and add the three integers to it. We then sort the list using `sort()` and print the sum of the first two elements using `print()`.</s>
