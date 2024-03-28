<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
-42

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;

public class p02786 {
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }


    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        p02786 obj = new p02786();
        long sum=0;
        long h=s.nextLong();
        if(h==1)
            System.out.println(1);

        else
        {
            long count=1;
            while(h>1)
            {
                h=h/2;
                sum+= (long) Math.pow(2,count);
                count++;
            }
            System.out.println(sum+1);
        }
    }






}
```
[/INST]
```python
import sys

def fast_reader():
    br = sys.stdin
    st = None

    def next_line():
        str = ""
        try:
            str = br.readline()
        except Exception as e:
            e.printStackTrace()
        return str

    def next_int():
        return int(next())

    def next_long():
        return long(next())

    def next_double():
        return float(next())

    def next():
        global st
        while st is None or not st.has_more_elements():
            try:
                st = str.split()
            except Exception as e:
                e.printStackTrace()
        return st[0]


if __name__ == "__main__":
    s = fast_reader()
    obj = p02786()
    sum = 0
    h = int(s.next_long())
    if h == 1:
        print(1)
    else:
        count = 1
        while h > 1:
            h = h // 2
            sum += (1 << count)
            count += 1
        print(sum + 1)
```</s>
