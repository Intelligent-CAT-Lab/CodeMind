<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

def main():
    try:
        input_str = sys.stdin.readline().strip().split()
        A = int(input_str[0])
        P = int(input_str[1])
        print((P + 3 * A) / 2)
    except Exception as e:
        print("Exception:", e)

if __name__ == "__main__":
    main()
```</s>
