Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
sippuu

Expected output:
Yes


```
import java.util.*;

class p02723{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    if(s.charAt(2)==s.charAt(3) && s.charAt(4) == s.charAt(5))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
```

### Response:
```python
import java.util.*;

class p02723:
  def main(self):
    sc = Scanner(System.in)
    s = sc.next()
    
    if s[2] == s[3] and s[4] == s[5]:
      print("Yes")
    else:
      print("No")
```

Explanation:

- We import the `java.util` package to use the `Scanner` class.
- We define a class `p02723` with a `main` method that takes no arguments.
- We create a `Scanner` object `sc` to read input from the standard input stream.
- We read a string `s` from the input stream using the `next` method of the `Scanner` class.
- We check if the characters at positions 2, 3, 4, and 5 of the string `s` are equal. If they are, we print "Yes". Otherwise, we print "No".<|endoftext|>
