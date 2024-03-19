<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abac

Expected output:
Y@ES

```
import java.util.*;

public class p03534 {
    public void main(Scanner sc) {
        String str = sc.next();
        int abc[] = new int[3];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                if (str.charAt(i) == "abc".charAt(j)) {
                    abc[j]++;
                }
            }
        }

        Arrays.sort(abc);

        System.out.println(((abc[1] - abc[0] < 2) && (abc[2] - abc[0] < 2)) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03534().main(sc);
        sc.close();
    }
}

```

### Response:
```python
def main(sc):
    str = sc.next()
    abc = [0, 0, 0]
    for i in range(len(str)):
        for j in range(3):
            if str[i] == "abc"[j]:
                abc[j] += 1

    abc.sort()

    print("YES" if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2) else "NO")

if __name__ == "__main__":
    sc = input()
    main(sc)
```

In this Python code, we define a function `main` that takes a string as input. We initialize a list `abc` with three zeros. We then iterate over each character in the input string and increment the corresponding index in `abc` if the character matches one of the three characters 'a', 'b', or 'c'. After sorting `abc`, we print "YES" if the difference between the second and first elements is less than 2 and the difference between the third and first elements is less than 2, otherwise we print "NO". The `main` function is then called with a string input.
<|EOT|>
