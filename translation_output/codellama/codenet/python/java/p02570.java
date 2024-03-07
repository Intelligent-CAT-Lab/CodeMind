<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

data=list(map(int,input().split()))
if data[0]/data[1]<=data[2]:
    print('Yes')
else:
    print('No')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[3];
        for (int i = 0; i < 3; i++) {
            data[i] = scanner.nextInt();
        }
        if (data[0] / data[1] <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer from the input. The input is stored in an array called `data`, and the code checks if the first element of the array divided by the second element is less than or equal to the third element. If it is, the code prints "Yes", otherwise it prints "No".</s>
