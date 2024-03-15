<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int prime = X;
        int mid = prime / 2;
        boolean flag = false;
        
        while (true) {
            for (int i = 2; i <= mid; ++i) {
                if (prime % i == 0) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                break;
            } else {
                flag = false;
            }
            
            prime++;
        }
        
        System.out.println(prime);
    }
}
```
[/INST]
```python
import sys

def main():
    n = int(input())
    prime = n
    mid = prime // 2
    flag = False
    
    while True:
        for i in range(2, mid+1):
            if n % i == 0:
                flag = True
                break
        
        if not flag:
            break
        else:
            flag = False
        
        n += 1
    
    print(n)

if __name__ == "__main__":
    main()
```</s>
