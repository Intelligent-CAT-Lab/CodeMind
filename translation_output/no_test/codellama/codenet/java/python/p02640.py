<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
import java.lang.Integer; 

public class p02640 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextInt(); // é ­æ°
    double y = sc.nextInt(); // è¶³ã®æ°
    double crane = -(y/2) + 2*x;
    double turtle = x - crane;
    if(turtle < 0 || crane < 0 || turtle % 1 != 0 || crane % 1 != 0 ){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}

Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    x, y = map(int, input().split())
    crane = -(y / 2) + 2 * x
    turtle = x - crane
    if turtle < 0 or crane < 0 or turtle % 1 != 0 or crane % 1 != 0:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input from a string to an integer. The `input` function is used to get the input from the user. The `split` method is used to split the input into two parts, which are then converted to integers using the `map` function. The `math` module is used to perform mathematical operations.</s>
