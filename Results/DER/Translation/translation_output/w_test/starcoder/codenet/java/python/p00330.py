<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
128


```

import java.util.Scanner;

public class p00330 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int W = scan.nextInt();
        
       
        
        
        System.out.println(W*32);
        
    }
}


```

python code:<fim_suffix><fim_middle>

```python

import sys

W = int(sys.stdin.readline())

print(W*32)

```
<|endoftext|>
