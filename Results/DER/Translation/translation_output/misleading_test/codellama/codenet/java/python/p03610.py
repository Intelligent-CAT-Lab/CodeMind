<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
acdro

```
import java.util.*;

class p03610{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");

        for(int i = 0; i < s.length(); i += 2){
            System.out.print(array[i]);
        }
        
    }
}
```
[/INST]
```
import java.util.*;

class p03610{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");

        for(int i = 0; i < s.length(); i += 2){
            System.out.print(array[i]);
        }
        
    }
}
```

Here's the Python code that translates the Java code:
```
import java.util.*;

class p03610:
    def main(self, args):
        sc = Scanner(System.in)
        s = sc.next()
        array = s.split("")

        for i in range(0, s.length(), 2):
            print(array[i])
```
Note that the `Scanner` class is not available in Python, so we need to use the `input()` function to read the input from the user. Also, the `split()` method is not available in Python, so we need to use the `split()` function from the `re` module.</s>
