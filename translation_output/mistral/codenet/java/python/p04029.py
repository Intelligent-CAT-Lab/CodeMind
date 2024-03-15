<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p04029{

  public static void main(String arg[]){
  Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    int n = sc.nextInt();
    for(int i = 1;i<=n;i++){
    sum = sum + i;
    }
    System.out.println(sum);
  }

}
```
[/INST]
```python
import sys

def main():
    n = int(input())
    sum = 0
    for i in range(1, n+1):
        sum += i
    print(sum)

if __name__ == "__main__":
    main()
```</s>
