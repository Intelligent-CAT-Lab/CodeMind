<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# AOJ 1591 Graph Making
# Python3 2018.7.13 bal4u

n, d = map(int, input().split())
if d == 1: print(n*(n-1)//2)
else: print((n-1)+(n-d-1)*n-((n-d-1)*(n+d-2)//2))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code for the same problem:
```
import java.util.Scanner;

public class GraphMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        if (d == 1) {
            System.out.println(n * (n - 1) / 2);
        } else {
            System.out.println((n - 1) + (n - d - 1) * n - ((n - d - 1) * (n + d - 2) / 2));
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the result. The logic for calculating the number of edges in the graph is the same as in the Python code.</s>
