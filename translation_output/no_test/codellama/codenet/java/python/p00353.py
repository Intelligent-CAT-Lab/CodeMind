<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p00353 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] input = sc.nextLine().split(" ");
      int m = Integer.parseInt(input[0]);
      int f = Integer.parseInt(input[1]);
      int b = Integer.parseInt(input[2]);
      
      if(b > m + f) {
         System.out.println("NA"); 
      } else if (b > m){
         System.out.println(b - m);
      } else {
         System.out.println("0");
      }
   }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

m, f, b = map(int, input().split())

if b > m + f:
    print("NA")
elif b > m:
    print(b - m)
else:
    print(0)
```
Note: The `map` function is used to convert the input strings to integers. The `input` function is used to read a line of input from the user. The `split` method is used to split the input string into a list of strings, where each string represents a number. The `int` function is used to convert each string to an integer.</s>
