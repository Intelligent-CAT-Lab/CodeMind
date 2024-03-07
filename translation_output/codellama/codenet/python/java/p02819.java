<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

def check(num):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                return False
                break
        else:
            return True
    else:
        return False


a = int(input())

for i in range(a, 100500):
    if check(i):
        print(i)
        break

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            System.out.println(num);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `for` loop to iterate through the numbers from 2 to `num`. If a number is found that divides `num` evenly, it is printed to the console and the loop is exited using the `break` statement. If no such number is found, the loop continues until `num` is reached, and the final value of `num` is printed to the console.</s>
