<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

n = int ( input ( ) )
cnt = 0
for i in range ( 1 , n + 1 ) :
    s = str ( i )
    if len ( s ) % 2 == 1 :
        cnt += 1
print ( cnt )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```

Note that the `Scanner` class is used to read input from the user, and the `String.valueOf()` method is used to convert an integer to a string. The `String.length()` method is used to get the length of the string, and the `%` operator is used to check if the length is odd.</s>
