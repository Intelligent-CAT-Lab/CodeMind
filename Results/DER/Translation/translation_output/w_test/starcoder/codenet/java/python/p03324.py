<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 5

Expected output:
5


```
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
  
```

python code:<fim_suffix><fim_middle>

```python
import sys

def search(a,b):
    o = (a%1000000 == 0) and 3 or (a%(10000)==0) and 2 or (a%100==0) and 1 or 0
    if b == o:
        return True
    else:
        return False

def main():
    D = int(sys.stdin.readline().strip())
    A = (D==2) and 10000 or (D==1) and 100 or 1
    N = int(sys.stdin.readline().strip())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count*A,D):
            ser += 1
    print(count*A)

if __name__ == '__main__':
    main()
```
<|endoftext|>
