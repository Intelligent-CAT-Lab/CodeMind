<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
class p03359{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt(); 
        if(b>=a){
            System.out.println(a);
        }else{
            System.out.println(a-1);
        }
    }
}
```
[/INST]
```python
import sys

def main():
    a = int(input())
    b = int(input())
    if b >= a:
        print(a)
    else:
        print(a - 1)

if __name__ == "__main__":
    main()
```</s>
