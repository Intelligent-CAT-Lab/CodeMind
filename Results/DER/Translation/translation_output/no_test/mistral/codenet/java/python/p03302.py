<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03302{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	if(a+b==15){
        	System.out.println("+");
        }else if(a*b==15){
        	System.out.println("*");
        }else{
        	System.out.println("x");
        }
    }
}
```
[/INST]
```python
import java.util

def main():
    sc = java.util.Scanner(System.in)
    a = sc.nextInt()
    b = sc.nextInt()
    if a + b == 15:
        print("+")
    elif a * b == 15:
        print("*")
    else:
        print("x")

if __name__ == "__main__":
    main()
```</s>
