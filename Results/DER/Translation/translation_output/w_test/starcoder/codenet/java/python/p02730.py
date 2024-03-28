<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
akasaka

Expected output:
Yes


```
import java.io.PrintWriter;
import java.util.*;

public class p02730 {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new p02730().run();
    }

    void run() {

        String s = sc.next();
        char[] arr = s.toCharArray();

        for (int i=0; i<s.length()/2; i++) {
            if (arr[i]!=arr[s.length()-1-i]) {
                out.print("No");
                out.flush();
                return;
            }
        }

        for (int i=0; i<s.length()/2-1; i++) {
            if (arr[i]!=arr[(s.length()/2)-1-i]) {
                out.print("No");
                out.flush();
                return;
            }
     
        }

        out.print("Yes");
        out.flush();
    }

}

```

python code:<fim_suffix><fim_middle>

```python
s = input()

for i in range(len(s)//2):
    if s[i]!=s[-1-i]:
        print("No")
        break
else:
    for i in range(len(s)//2-1):
        if s[i]!=s[-1-i]:
            print("No")
            break
    else:
        print("Yes")
```
<|endoftext|>
