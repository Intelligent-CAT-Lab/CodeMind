System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import java.util.Scanner;

class p04029:

  def main(self):
    sc = Scanner(System.in)
    n = sc.nextInt()
    sum = 0
    for i in range(1, n+1):
      sum += i
    print(sum)
```<|endoftext|>
