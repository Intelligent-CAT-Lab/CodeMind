<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

k , n , w = map ( int , input ( ) . strip ( ) . split ( ) )
sum = 0
for i in range ( 1 , w + 1 ) :
    sum += k * i
if sum <= n :
    print ( 0 )
else :
    print ( sum - n )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}
```
Note that the `map` function in Python is not necessary in Java, as the `Scanner` class provides a way to read input from the user and convert it to the desired data type.</s>
