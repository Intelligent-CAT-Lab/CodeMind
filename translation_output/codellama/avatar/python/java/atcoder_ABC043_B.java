<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

s = str ( input ( ) )
my_str = ' '
for c in s :
    if c == '0' or c == '1' :
        my_str += c
    elif c == ' B ' and len ( my_str ) != 0 :
        my_str = my_str [ : len ( my_str ) - 1 ]
print ( my_str )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String myStr = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                myStr += c;
            } else if (c == 'B' && myStr.length() != 0) {
                myStr = myStr.substring(0, myStr.length() - 1);
            }
        }
        System.out.println(myStr);
    }
}
```

Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to manipulate strings. The `charAt` method is used to access individual characters in a string, and the `substring` method is used to extract a substring from a string.</s>
