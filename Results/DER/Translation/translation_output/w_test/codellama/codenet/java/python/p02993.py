<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3776

Expected output:
Bad


```

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class p02993 {


    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        boolean flag = false;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("Bad");
        else System.out.println("Good");
    }




}


class Scanner
{
    StringTokenizer st;
    BufferedReader br;

    public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

    public String next() throws IOException
    {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public int nextInt() throws IOException {return Integer.parseInt(next());}

    public long nextLong() throws IOException {return Long.parseLong(next());}

    public String nextLine() throws IOException {return br.readLine();}

    public double nextDouble() throws IOException
    {
        String x = next();
        StringBuilder sb = new StringBuilder("0");
        double res = 0, f = 1;
        boolean dec = false, neg = false;
        int start = 0;
        if(x.charAt(0) == '-')
        {
            neg = true;
            start++;
        }
        for(int i = start; i < x.length(); i++)
            if(x.charAt(i) == '.')
            {
                res = Long.parseLong(sb.toString());
                sb = new StringBuilder("0");
                dec = true;
            }
            else
            {
                sb.append(x.charAt(i));
                if(dec)
                    f *= 10;
            }
        res += Long.parseLong(sb.toString()) / f;
        return res * (neg?-1:1);
    }

    public boolean ready() throws IOException {return br.ready();}


}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class Scanner:
    def __init__(self, input_stream):
        self.br = BufferedReader(InputStreamReader(input_stream))
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.br.readLine())
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextLine(self):
        return self.br.readLine()

    def nextDouble(self):
        x = self.next()
        sb = StringBuilder("0")
        res = 0
        f = 1
        dec = False
        neg = False
        start = 0
        if x.charAt(0) == '-':
            neg = True
            start += 1
        for i in range(start, len(x)):
            if x.charAt(i) == '.':
                res = long(sb.toString())
                sb = StringBuilder("0")
                dec = True
            else:
                sb.append(x.charAt(i))
                if dec:
                    f *= 10
        res += long(sb.toString()) / f
        return res * (neg and -1 or 1)

    def ready(self):
        return self.br.ready()


def main():
    s = Scanner(sys.stdin)
    word = s.next()
    flag = False
    for i in range(len(word) - 1):
        if word.charAt(i) == word.charAt(i + 1):
            flag = True
            break
    if flag:
        print("Bad")
    else:
        print("Good")


if __name__ == "__main__":
    main()
```
Note that the `Scanner` class in Python is not exactly the same as the `Scanner` class in Java, but it should work similarly. The `nextInt`, `nextLong`, and `nextDouble` methods in Python are similar to the `nextInt`, `nextLong`, and `nextDouble` methods in Java, but they may not be exactly the same. The `ready` method in Python is not exactly the same as the `ready` method in Java, but it should work similarly.</s>
