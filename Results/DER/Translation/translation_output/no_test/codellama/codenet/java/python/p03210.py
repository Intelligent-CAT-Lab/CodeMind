<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
import java.math.BigDecimal;

public class p03210 {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
      
      	if(age == 3 || age == 5 || age == 7) {
        	System.out.println("YES");
        } else {
          	System.out.println("NO");
        }

    }
}

Translate the above java code to python.

python code:

[/INST]
```
import math

def is_multiple_of_3_or_5(age):
    if age % 3 == 0 or age % 5 == 0:
        return "YES"
    else:
        return "NO"

age = int(input("Enter your age: "))
print(is_multiple_of_3_or_5(age))
```
This code uses the modulo operator (`%`) to check if the age is a multiple of 3 or 5. If it is, it returns "YES", otherwise it returns "NO".

You can also use the `math.gcd()` function to check if the age is a multiple of 3 or 5.
```
import math

def is_multiple_of_3_or_5(age):
    if math.gcd(age, 3) == 1 or math.gcd(age, 5) == 1:
        return "YES"
    else:
        return "NO"

age = int(input("Enter your age: "))
print(is_multiple_of_3_or_5(age))
```
This code uses the `math.gcd()` function to check if the age is a multiple of 3 or 5. If it is, it returns "YES", otherwise it returns "NO".</s>
