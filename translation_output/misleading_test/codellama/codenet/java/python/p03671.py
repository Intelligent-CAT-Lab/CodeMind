<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
700 600 780

Expected output:
1222

```
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

```
[/INST]
```
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    sum = [a, b, c]
    sum.sort()
    print(sum[0] + sum[1])

if __name__ == "__main__":
    main()
```
This code uses the `map` function to convert the input strings to integers, and then uses the `sort` function to sort the list of integers in ascending order. Finally, it prints the sum of the first two elements of the sorted list.

Note that the `sys` module is used to read input from stdin, and the `map` function is used to convert the input strings to integers. The `sort` function is used to sort the list of integers in ascending order, and the `print` function is used to print the result.</s>
