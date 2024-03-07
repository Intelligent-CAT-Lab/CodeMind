<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N = int(input())
count = 1
while count <= N:
    count *= 2
print(round(count/2))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(Math.round(count / 2));
    }
}
```
Note that the `Math.round()` method is used to round the result to the nearest integer.</s>
