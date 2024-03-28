<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
3


```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class p03029 {
    public static void main(String[] args){
        try {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String str[] = (br.readLine()).split("\\s+");
        int A = Integer.parseInt(str[0]);
        int P = Integer.parseInt(str[1]);
        System.out.println((P+3*A)/2);

        } catch(IOException e) {
            System.out.println("Exception :" + e);
        }

    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    A, P = map(int, sys.stdin.readline().split())
    print((P+3*A)/2)

if __name__ == "__main__":
    main()
```
<|endoftext|>
