Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
class p03577{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int length = line.length();
        System.out.println(line.substring(0,line.length()-8));
    }
}

```

### Response:
```python
import java.util.*;

class p03577:
    def main(self):
        sc = Scanner(System.in)
        line = sc.nextLine()
        length = len(line)
        print(line[:length-8])
```

Explanation:

- We import the `java.util` package to use the `Scanner` class.
- We define a class `p03577` with a method `main` that takes no arguments.
- Inside the `main` method, we create a new `Scanner` object named `sc` to read input from the standard input stream.
- We read a line of input from the user using the `nextLine` method of the `Scanner` class and store it in a variable named `line`.
- We get the length of the input string using the `len` function and store it in a variable named `length`.
- We print the substring of `line` from index 0 to `length-8` using slicing notation.<|endoftext|>
