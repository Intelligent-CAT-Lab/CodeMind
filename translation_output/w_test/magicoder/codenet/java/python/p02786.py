<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
class FastReader:
    def __init__(self):
        self.br = input()

    def nextInt(self):
        return int(self.br)


def main():
    s = FastReader()
    h = s.nextInt()
    if h == 1:
        print(1)
    else:
        count = 1
        sum = 0
        while h > 1:
            h = h // 2
            sum += 2 ** count
            count += 1
        print(sum + 1)


if __name__ == "__main__":
    main()
```

In the Python version, we define a class `FastReader` that reads input from the user. The `nextInt` method converts the input to an integer. The `main` function reads the input, checks if it's 1, and if not, it calculates the sum of the powers of 2 from 1 to the number of times the input can be divided by 2 (which is equivalent to the number of times the input can be halved). The result is then printed.<｜end▁of▁sentence｜>
