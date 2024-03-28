Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CUODE

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
        line = sc.next()
        length = len(line)
        print(line[:length-8])

if __name__ == '__main__':
    p03577().main()
```

Explanation:

- We first import the necessary java packages and create a class `p03577`.
- Inside the class, we create a `main` method that takes in no arguments.
- We create a `Scanner` object to read input from the user.
- We read the input string using the `next` method of the `Scanner` object.
- We get the length of the input string using the `len` function.
- We print the substring of the input string from index 0 to `length-8`.
- Finally, we call the `main` method of the `p03577` class.<|endoftext|>
