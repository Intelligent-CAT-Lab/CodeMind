Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import java.util.Scanner;

public class p00330 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int W = scan.nextInt();
        
        int L = W*32;
        
        System.out.println(L);
        
    }
}
```

Explanation:

- We first import the `java.util.Scanner` package to read input from the user.
- We create a `Scanner` object named `scan` to read input from the standard input stream.
- We read an integer value from the user using the `nextInt()` method of the `Scanner` class and store it in the variable `W`.
- We calculate the length of the rope by multiplying the width `W` by 32 and store it in the variable `L`.
- We print the length of the rope using the `println()` method of the `System.out` object.<|endoftext|>
