Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03945{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    String[] str=new String[s.length()];
    int counter=0;
    for(int i=0;i<str.length;i++){
      str[i]=s.substring(i, i+1);
    }
    for(int i=0;i<str.length-1;i++){
      if(!str[i].equals(str[i+1])){
        counter++;
      }
    }
    System.out.println(counter);
  }
}
```

### Response:
```python
import java.util.*;

public class p03945:
  def main(args):
    sc = Scanner(System.in)
    s = sc.next()
    sc.close()
    str = [s[i:i+1] for i in range(len(s))]
    counter = 0
    for i in range(len(str)-1):
      if str[i]!= str[i+1]:
        counter += 1
    System.out.println(counter)
```

Explanation:

- We first import the `java.util` package to use the `Scanner` class.
- We create a `Scanner` object to read input from the user.
- We read the input string `s` from the user using the `next()` method of the `Scanner` class.
- We close the `Scanner` object to release the resources.
- We create a list `str` of strings by slicing the input string `s` using a for loop.
- We initialize a counter variable `counter` to 0.
- We loop through the list `str` using a for loop and compare adjacent elements.
- If the elements are not equal, we increment the counter variable `counter`.
- Finally, we print the value of the counter variable `counter`.<|endoftext|>
