<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n=int(input())

dic={}
for i in range(1,50001):
    p=int(i*1.08)
    dic[p]=i
if n in dic:
    print(dic[n])
else:
    print(":(")

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[50001];
        for (int i = 1; i <= 50000; i++) {
            arr[i] = (int) (i * 1.08);
        }

        if (arr[n] != 0) {
            System.out.println(arr[n]);
        } else {
            System.out.println(":(");
        }
    }
}
```
Note that in Java, we use the `Scanner` class to read input from the user, and we use the `nextInt()` method to read an integer value. We also use the `int[]` array to store the values of the array.

Also, in Java, we use the `System.out.println()` method to print the output to the console.

I hope this helps! Let me know if you have any questions or need further assistance.</s>
