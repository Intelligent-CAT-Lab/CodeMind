<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class p02999{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
    int b = sc.nextInt();  // input Integer
//    String a = sc.next();  // input String
    if (a<b){
      System.out.println(0);
    } else {
      System.out.println(10);
    }
  }
}
```
[/INST]
```python
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    a = sc.nextInt()  # input Integer
    b = sc.nextInt()  # input Integer
    if a < b:
        print(0)
    else:
        print(10)

if __name__ == '__main__':
    main()
```</s>
