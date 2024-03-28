Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
46979

Expected output:
13:2:59


```
import java.util.Scanner;

public class p02390{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int h = S / 3600;
        int hi = S % 3600;
        int m = hi / 60;
        int s = S % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}

```

### Response:
```python
S = int(input())
h = S // 3600
hi = S % 3600
m = hi // 60
s = S % 60
print(f"{h}:{m}:{s}")
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We then read the input integer `S` from the user using the `Scanner` class.
- We calculate the hours, minutes and seconds using integer division and modulo operations.
- Finally, we print the output in the required format using an f-string.<|endoftext|>
