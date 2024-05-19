System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
bac

Expected output:
Yews

```
import java.util.*;

public class p03385 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.next().toCharArray();
        boolean abc[] = new boolean[3];
        for(int i = 0; i < 3; i++) {
            if( s[i] == 'a' ) abc[0] = true;
            if( s[i] == 'b' ) abc[1] = true;
            if( s[i] == 'c' ) abc[2] = true;
        }
        
        boolean isOK = true;
        for(int i = 0; i < 3; i++) {
            isOK &= abc[i];
        }
        
        System.out.println( (isOK)? "Yes" : "No" );
    }
}

```


Answer:
```python
def main():
    s = input()
    abc = [False] * 3
    for c in s:
        if c == 'a':
            abc[0] = True
        elif c == 'b':
            abc[1] = True
        elif c == 'c':
            abc[2] = True
    isOK = True
    for b in abc:
        isOK &= b
    print("Yes" if isOK else "No")

if __name__ == '__main__':
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "bac",
    "abc",
    "ab",
    "bc",
    "ca",
    "cba",
    "abca",
    "bacab",
    "bacabc",
]

expected_outputs = [
    "Yes",
    "Yes",
    "Yes",
    "Yes",
    "Yes",
    "Yes",
    "Yes",
    "Yes",
    "Yes",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    print(f"Test input: {test_input}")
    main()
    print(f"Expected output: {expected_output}")
```<|endoftext|>
