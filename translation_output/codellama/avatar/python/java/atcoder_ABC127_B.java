<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

r , D , x = map ( int , input ( ) . split ( ) )
for i in range ( 10 ) :
    x = r * x - D
    print ( x )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
```
Note that the `map` function in Python is not necessary in Java, as the `Scanner` class provides a way to read input from the user and convert it to the desired data type.</s>
