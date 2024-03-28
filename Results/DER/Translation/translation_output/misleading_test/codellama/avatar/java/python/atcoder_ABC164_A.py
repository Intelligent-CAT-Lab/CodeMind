<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 100

Expected output:
unRsafe

```
import java.util.*;

public class atcoder_ABC164_A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        scList.add(scan.nextLine());

        String[] numlist = scList.get(0).split(" ");
        int Sheep = Integer.parseInt(numlist[0]);
        int Wolve = Integer.parseInt(numlist[1]);

        if (Wolve >= Sheep) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```
[/INST]
```python
import sys

def main():
    input_str = sys.stdin.readline().strip()
    numlist = input_str.split(" ")
    Sheep = int(numlist[0])
    Wolve = int(numlist[1])

    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()
```
Note: The `sys` module is used to read input from stdin, and the `strip()` method is used to remove any trailing newline characters from the input string. The `split()` method is used to split the input string into a list of strings, and the `int()` function is used to convert the strings to integers.</s>
