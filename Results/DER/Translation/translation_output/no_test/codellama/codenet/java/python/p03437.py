<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

/*
String[]ã®åæåãæ´æ°ã®åãlongã«ãªã£ã¦ããã
é¢æ°ï¼splitã¨ãcontainsã¨ãï¼åã§ã¯"+"ã¨ãã¯æ­£è¦è¡¨ç¾ã¨ãªãããã®ã§"\\+"ã¨ãã
éåã®ã³ãã¼ã¯arr1=arr.clone()
HashSet<>[]ã¯ãã®ãã®åæåããï¼ï¼ï¼ï¼ï¼
è² ã®æ°ã®å²ãç®ã¯çµ¶å¯¾å¤ãå°ããã»ãã«åãæ¨ã¦ãããex.-1/2=0ã®ã§ãããå¤>kã¿ãããªå¼ã ã¨ãã°ãããããã®ã§æ³¨æ
ããå¤>=kã¨ãã¦ãåãä¸ããå¤ãã¨ãã¹ã
toLowerCase()ã¯ã¢ã«ãã¡ãããä»¥å¤ã«å¯¾ãã¦è¡ã£ã¦ãã¨ã©ã¼ã«ã¯ãªããªã
 */
//å¥åçµäºâCtrl+D
import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.System.*;
import static java.lang.Math.*;
public class p03437 {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        long x=sc.nextLong(),y=sc.nextLong();
        if(x%y==0){
            out.println(-1);
        }else {
            out.println(x);
        }
    }
}

Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    x, y = map(int, input().split())
    if x % y == 0:
        print(-1)
    else:
        print(x)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the given Java code. The `map()` function is used to convert the input string to a list of integers, and the `split()` method is used to split the input string into two integers. The `if` statement checks if the first integer is divisible by the second integer, and if it is, it prints -1, otherwise it prints the first integer.</s>
