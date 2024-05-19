System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03835{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int k = scan.nextInt();
        int s = scan.nextInt();


        // search
        int count = 0;
        for(int x = 0; x <= k; x++){
            for(int y = 0; y <= k; y++){
                int z = s - x - y;
                if(z >= 0 && z <= k){
                    count++;
                }
            }
        }


        // answer
        System.out.println(count);

    }
}
```


Answer:
```python
import sys

def main():
    k, s = map(int, sys.stdin.readline().split())
    count = 0
    for x in range(k + 1):
        for y in range(k + 1):
            z = s - x - y
            if 0 <= z <= k:
                count += 1
    print(count)

if __name__ == "__main__":
    main()
```<|endoftext|>
