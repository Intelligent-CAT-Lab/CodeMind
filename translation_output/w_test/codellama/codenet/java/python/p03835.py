<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
6


```
import java.util.*;

public class p03835{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int k = scan.nextInt();
        int s = scan.nextInt();


        // search
        int count = 0;
        for(int x = 0; x <= k; x++){
            for(int y = 0; y <= k; y++){
                int z = s - x - y;
                if(z >= 0 && z <= k){
                    count++;
                }
            }
        }


        // answer
        System.out.println(count);

    }
}
```
[/INST]
```
import sys

k, s = map(int, sys.stdin.readline().split())

count = 0
for x in range(k+1):
    for y in range(k+1):
        z = s - x - y
        if 0 <= z <= k:
            count += 1

print(count)
```
This code uses the `map` function to convert the input string to a list of integers, and then uses a nested loop to iterate over all possible values of `x` and `y` that satisfy the constraints. For each pair of values, it calculates the value of `z` and checks if it is within the range of 0 to `k`. If it is, it increments the `count` variable. Finally, it prints the value of `count`.</s>
