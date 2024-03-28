<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 4

Expected output:
3


```
import java.util.Scanner;
public class p02783 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");

            int h = Integer.valueOf(line[0]);
            int a = Integer.valueOf(line[1]);

            int n = h/a;
            if (h%a > 0) {
                n += 1;
            }

            // åºå
            System.out.println(n);
        }
    }
}
```
[/INST]
```python
def main():
    line = input().split()
    h = int(line[0])
    a = int(line[1])

    n = h//a
    if h%a > 0:
        n += 1

    print(n)

if __name__ == '__main__':
    main()
```</s>
