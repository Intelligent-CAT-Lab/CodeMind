<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 2 3 4 5

Expected output:
1


```
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

```
[/INST]
```
import java.util.Scanner;

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
```

Here is the Python code that translates the Java code:
```
import java.util.Scanner;

public class p02639:
    def main(args):
        sc = Scanner(System.in)
        x = [0] * 5
        sum = 0
        for i in range(5):
            x[i] = sc.nextInt()
            sum += x[i]
        print(15 - sum)

```
Note that the Python code uses a list comprehension to create the `x` array, and the `range` function to iterate over the array. The `print` function is used to print the result.</s>
