<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 1 1

Expected output:
1.41421356


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

python code:<fim_suffix><fim_middle>

```python
import math

def main():
    x1, y1, x2, y2 = map(float, input().split())
    print(math.sqrt((x1-x2)**2 + (y1-y2)**2))

if __name__ == '__main__':
    main()
```
<|endoftext|>
