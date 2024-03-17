<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
acdr


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
Note that the `range` function in Python takes a third argument that specifies the step size, so we can use it to iterate over the array in steps of 2.</s>
