<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

a , b = map ( int , input ( ) . split ( ) )
x = a
h = 0
s = 0
while x > 0 :
    x -= 1
    h += 1
    s += 1
while s // b != 0 :
    h += 1
    s = s - b + 1
print ( h )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a;
        int h = 0;
        int s = 0;
        while (x > 0) {
            x--;
            h++;
            s++;
        }
        while (s / b != 0) {
            h++;
            s = s - b + 1;
        }
        System.out.println(h);
    }
}
```
Note that the `map` function in Python is not necessary in Java, as the `Scanner` class provides a way to read input from the user. Also, the `//` operator in Python is equivalent to the `/` operator in Java, which performs integer division.</s>
