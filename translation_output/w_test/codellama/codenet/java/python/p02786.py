<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
3


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
import math

class FastReader:
    def __init__(self):
        self.br = open(0)

    def next_line(self):
        return self.br.readline().strip()

    def next_int(self):
        return int(self.next_line())

    def next_long(self):
        return int(self.next_line())

    def next_double(self):
        return float(self.next_line())

    def next(self):
        return self.next_line()


class p02786:
    def __init__(self):
        self.s = FastReader()

    def main(self):
        h = self.s.next_long()
        if h == 1:
            print(1)
        else:
            count = 1
            while h > 1:
                h = h // 2
                sum = sum + math.pow(2, count)
                count += 1
            print(sum + 1)


if __name__ == "__main__":
    obj = p02786()
    obj.main()
```
Note that the `FastReader` class is not necessary in Python, as the `input()` function can be used to read input from the user. Additionally, the `math.pow()` function can be used to calculate the power of a number.</s>
