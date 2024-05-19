System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
54 20

Expected output:
2


```
import java.io.*;

class p02256 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(GCD(a, b));
    }

    public static int GCD (int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0) return b;
        else return GCD (b, a%b);
    }
}
```


Answer:
```python
def GCD(a, b):
    if a < b:
        temp = a
        a = b
        b = temp
    if a % b == 0:
        return b
    else:
        return GCD(b, a % b)

def main():
    input = input().split(" ")
    a = int(input[0])
    b = int(input[1])
    print(GCD(a, b))

if __name__ == "__main__":
    main()
```

Test input:
```
54 20
```

Expected output:
```
2
```<|endoftext|>
