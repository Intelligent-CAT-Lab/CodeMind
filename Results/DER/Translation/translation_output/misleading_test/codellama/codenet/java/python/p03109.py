<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2019/04/30

Expected output:
|Fi+<i

```
import java.util.Scanner;
class p03109{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String time=scn.next().substring(5);
        if(time.charAt(0)=='1'||Character.getNumericValue(time.charAt(1))>4) {
            System.out.println("TBD");
        }else{
            System.out.println("Heisei");
        }
    }
}

```
[/INST]
```
import java.util.Scanner;

class p03109:
    def main(self, args):
        scn = Scanner(System.in)
        time = scn.next().substring(5)
        if time.charAt(0) == '1' or Character.getNumericValue(time.charAt(1)) > 4:
            print("TBD")
        else:
            print("Heisei")

```
This is the Python code for the given Java code. The `Scanner` class is used to read input from the user, and the `substring` method is used to extract the substring starting from the 5th character. The `charAt` method is used to get the character at a specific index, and the `getNumericValue` method is used to get the numeric value of a character. The `if` statement is used to check if the first character is '1' or if the second character is greater than 4, and the `else` statement is used to print "Heisei" if the condition is not met.</s>
