System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
A

Expected output:


```
import java.util.Scanner;
public class p03085 {
  public static void main(String args[]) {
    final Scanner scanner = new Scanner(System.in);
    final String helix = scanner.next();
    scanner.close();
    switch(helix) {
      case "A":
        System.out.println("T");
        break;
      case "T":
        System.out.println("A");
        break;
      case "C":
        System.out.println("G");
        break;
      case "G":
        System.out.println("C");
        break;
    }
  }
}
```


Answer:
```python
import sys

def main():
    helix = sys.stdin.read().strip()
    switcher = {
        "A": "T",
        "T": "A",
        "C": "G",
        "G": "C",
    }
    print(switcher.get(helix, "Invalid input"))

if __name__ == "__main__":
    main()
```

Test input:
A

Expected output:
T<|endoftext|>
