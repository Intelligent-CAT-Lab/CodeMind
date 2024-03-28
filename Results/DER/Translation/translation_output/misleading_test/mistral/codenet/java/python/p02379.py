<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 1 1

Expected output:
-24.650930100857785

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02379 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] lines=br.readLine().split(" ");
       double[] list=new double[4];
       int n=4;
       while(n-->0){
           list[n]=Double.parseDouble(lines[n]);
       }
       System.out.println(Math.sqrt((list[0]-list[2])*(list[0]-list[2])+(list[1]-list[3])*(list[1]-list[3])));
       
    }
}
```
[/INST]
```python
import sys

def main():
    lines = sys.stdin.readline().split()
    list = [float(line) for line in lines]
    n = len(list)
    print(round(math.sqrt((list[0]-list[2])*(list[0]-list[2])+(list[1]-list[3])*(list[1]-list[3])), 6))

if __name__ == "__main__":
    main()
```</s>
