<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b, k = map(int, input().split())

res = []
for i in range(1, 101):
    if a % i == 0 and b % i == 0:
        res.append(i)

res.sort(reverse=True)
print(res[k-1])


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        int[] res = new int[100];
        for (int i = 1; i <= 100; i++) {
            if (a % i == 0 && b % i == 0) {
                res[i] = i;
            }
        }

        Arrays.sort(res);
        System.out.println(res[k - 1]);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays.sort()` method to sort the array of integers in descending order. The `System.out.println()` method is used to print the result to the console.

Note that the Python code uses the `map()` function to convert the input strings to integers, but in Java, we can use the `Scanner` class to read input and convert it to integers directly.</s>
