<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N=int(raw_input())

num = [[0 for i in range(10)] for j in range(10)]

for i in range(1,N+1):
    if i % 10 > 0:
        num[int(str(i)[0])][i % 10] += 1

#print num

c = 0
for i in range(1,10):
    for j in range(1,10):
        c += num[i][j]*num[j][i]
print c


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] num = new int[10][10];

        for (int i = 1; i <= N; i++) {
            if (i % 10 > 0) {
                num[i / 10][i % 10]++;
            }
        }

        int c = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                c += num[i][j] * num[j][i];
            }
        }

        System.out.println(c);
    }
}
```
Note that in Java, we use the `Scanner` class to read input from the user, and we use the `nextInt()` method to read an integer value from the user. We also use the `int[][]` data type to represent a 2D array of integers.

Also, note that in Java, we use the `++` operator to increment a variable, and we use the `+=` operator to add a value to a variable.

I hope this helps! Let me know if you have any questions or need further assistance.</s>
