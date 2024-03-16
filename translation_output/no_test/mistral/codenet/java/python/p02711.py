<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7") ? "Yes" : "No");
    }
}
```
[/INST]
```python
import sys

def main():
    n = int(input())
    string = str(n)
    print("Yes" if "7" in string else "No")

if __name__ == "__main__":
    main()
```</s>
