System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
MRL

Expected output:
JOI


```
w=input()
list=[]
for i in range(len(w)):
    if w[i]=='C':
        list.append('Z')
        
    elif w[i]=='B':
        list.append('Y')
        
    elif w[i]=='A':
        list.append('X')
    else:
        c=ord(w[i])-3
        list.append(chr(c))
l=''.join(list)
print(l)
    

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String result = "";
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == 'C') {
                result += 'Z';
            } else if (c == 'B') {
                result += 'Y';
            } else if (c == 'A') {
                result += 'X';
            } else {
                result += (char) (c - 3);
            }
        }
        System.out.println(result);
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test1() {
        assertEquals("JOI", Main.translate("MRL"));
    }

    @Test
    public void test2() {
        assertEquals("XYZ", Main.translate("ABC"));
    }

    @Test
    public void test3() {
        assertEquals("DEF", Main.translate("GHI"));
    }
}
```<|endoftext|>
