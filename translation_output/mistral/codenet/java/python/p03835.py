<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

k = int(input())
s = int(input())

count = 0
for x in range(k+1):
    for y in range(k+1):
        z = s - x - y
        if z >= 0 and z <= k:
            count += 1

print(count)
```</s>
