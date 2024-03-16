<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03324{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long D = sc.nextLong();
    Long A = (D==2)?10000L:(D==1)?100L:1L;
    Long N = sc.nextLong();
    Long ser = 0L;
    Long count = 0L;
    while(ser < N){
      count += 1L;
      if(search(count*A,D)){
        ser += 1L;
      }
      
    }
    System.out.println(count*A);
    sc.close();
  }
  public static boolean search(Long a,Long b){
    Long o = (a%1000000 == 0)?3L:(a%(10000)==0)?2L:(a%100==0)?1L:0L;
    if (b == o){
      return true;
    }
    else{
      return false;
    }
  }
}
  

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    D = int(sys.stdin.readline())
    A = 10000 if D == 2 else 100 if D == 1 else 1
    N = int(sys.stdin.readline())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

def search(a, b):
    o = 3 if a % 1000000 == 0 else 2 if a % 10000 == 0 else 1 if a % 100 == 0 else 0
    return b == o

if __name__ == "__main__":
    main()
```
Note that the `search` function is the same as the `search` function in the Java code, and the `main` function is the same as the `main` function in the Java code, except that the input and output are handled differently in Python. In Python, we use the `sys` module to read input from stdin and write output to stdout.</s>
