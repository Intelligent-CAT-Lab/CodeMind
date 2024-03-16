<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

num = input ( ) . split ( " . " )
if int ( num [ 0 ] [ - 1 ] ) == 9 :
    print ( " GOTO â Vasilisa . " )
else :
    if int ( num [ 1 ] [ 0 ] ) >= 5 :
        print ( f " { int ( num [ 0 ] ) + 1 } " )
    else :
        print ( num [ 0 ] )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split("\\.");
        if (Integer.parseInt(num[0].charAt(num[0].length() - 1)) == 9) {
            System.out.println("GOTO Vasilisa");
        } else {
            if (Integer.parseInt(num[1].charAt(0)) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `split` method is used to split the input string into an array of strings based on the specified delimiter (in this case, a period). The `parseInt` method is used to convert the input string to an integer, and the `charAt` method is used to access the last character of the first element of the `num` array. The `println` method is used to print the output to the console.</s>
