<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    x = int(input())  # é ­æ°
    y = int(input())  # è¶³ã®æ°
    crane = -(y/2) + 2*x
    turtle = x - crane
    if turtle < 0 or crane < 0 or turtle != int(turtle) or crane != int(crane):
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```
<|EOT|>
