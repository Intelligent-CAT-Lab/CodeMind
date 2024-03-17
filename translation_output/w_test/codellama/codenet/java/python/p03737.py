<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoder beginner contest

Expected output:
ABC


```
import java.util.*;

public class p03737{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        for(int i = 0; i < 3; i++){
                                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
                        }
                        System.out.println("");
                }
        }
}
```
[/INST]
```
import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
            }
            System.out.println("");
        }
    }
}
```

Here's the Python code that translates the Java code:
```
import java.util.Scanner

class p03737:
    def main(self, args):
        try:
            sc = Scanner(System.in)
            for i in range(3):
                print(Character.toUpperCase(sc.next().charAt(0)))
            print("")
        except:
            pass
```
Note that the `try` block is used to handle the `Scanner` object, and the `for` loop is used to iterate over the input string and print the uppercase characters. The `Character.toUpperCase()` method is used to convert the characters to uppercase.</s>
