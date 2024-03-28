<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

t1,t2,r1,r2 = map(int,input().split())
if r1 == -1 or r2 == -1:
    if t1 < t2:
        print('Alice')
    elif t1 > t2:
        print('Bob')
    else:
        print('Draw')
elif r1 > r2:
    print('Alice')
elif r1 < r2:
    print('Bob')
else:
    print('Draw')


Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();

        if (r1 == -1 || r2 == -1) {
            if (t1 < t2) {
                System.out.println("Alice");
            } else if (t1 > t2) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        } else if (r1 > r2) {
            System.out.println("Alice");
        } else if (r1 < r2) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print the output.

Note that in Java, you need to import the `Scanner` class from the `java.util` package in order to use it.</s>
