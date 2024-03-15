<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
import java.util.ArrayList
import java.util.Arrays
import java.util.StringTokenizer
import java.io

class FastReader:
    def __init__(self):
        self.br = BufferedReader(InputStreamReader(sys.stdin))
        self.st = None

    def nextLine(self):
        str = ""
        try:
            str = self.br.readLine()
        except IOError as e:
            e.printStackTrace()
        return str

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def next(self):
        while self.st is None or not self.st.hasMoreElements():
            try:
                self.st = StringTokenizer(self.br.readLine())
            except IOError as e:
                e.printStackTrace()
        return self.st.nextToken()


if __name__ == "__main__":
    s = FastReader()
    obj = p02786()
    sum = 0
    h = s.nextLong()
    if h == 1:
        print(1)

    else:
        count = 1
        while h > 1:
            h = h // 2
            sum += (long) (2 ** count)
            count += 1
        print(sum + 1)
```</s>
