<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```
import sys

time = sys.stdin.readline().split()[5]

if time[0] == '1' or int(time[1]) > 4:
    print("TBD")
else:
    print("Heisei")
```
Note: The `sys.stdin.readline()` method is used to read a line of input from the standard input stream, and the `split()` method is used to split the line into a list of strings based on whitespace. The `time[0]` and `time[1]` are used to access the first and second characters of the time string, respectively. The `int()` function is used to convert the second character to an integer.</s>
