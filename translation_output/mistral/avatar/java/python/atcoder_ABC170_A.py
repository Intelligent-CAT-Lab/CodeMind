<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anser = 0;
        int[] count = new int[5];
        
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            count[i] += x;
            
            if (count[i] == 0) {
                anser = i;
            }
        }
        
        System.out.println(anser + 1);
    }
}
```
[/INST]
```python
import sys

def main():
    n = int(input())
    count = [0] * 5
    for i in range(5):
        count[i] += int(input())
        if count[i] == 0:
            print(i + 1)
            return
    print("No answer")

if __name__ == "__main__":
    main()
```</s>
