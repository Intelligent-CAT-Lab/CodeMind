System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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

        System.out.println(((abc[1] - abc[0] < 2) && (abc[2] - abc[0] < 2))? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03534().main(sc);
        sc.close();
    }
}

```


Answer:
```python
def main():
    str = input()
    abc = [0, 0, 0]
    for i in range(len(str)):
        for j in range(3):
            if str[i] == "abc"[j]:
                abc[j] += 1
    abc.sort()
    if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

Test input:
```
abac
```

Expected output:
```
YES
```<|endoftext|>
