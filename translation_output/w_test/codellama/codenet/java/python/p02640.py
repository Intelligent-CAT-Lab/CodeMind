<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8

Expected output:
Yes


```
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
```
[/INST]
```
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
Note that the `math` module is not required in this solution, but it is used to make the code more readable and to avoid using the `//` operator to perform integer division.</s>
