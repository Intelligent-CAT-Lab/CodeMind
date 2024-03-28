<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
6


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

@@ Response
```python
# input
k, s = map(int, input().split())

# search
count = 0
for x in range(k+1):
    for y in range(k+1):
        z = s - x - y
        if 0 <= z <= k:
            count += 1

# answer
print(count)
```

This Python code does the same thing as the Java code. It reads two integers from the input, then counts the number of triples (x, y, z) such that 0 <= x, y, z <= k and x + y + z = s. The result is then printed to the standard output.<｜end▁of▁sentence｜>
