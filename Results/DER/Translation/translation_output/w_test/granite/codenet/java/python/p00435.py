System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
MRL

Expected output:
JOI


```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```


Answer:
Here's the Python code:

```python
def main():
    s = ""
    for c in input().strip():
        s += chr((ord(c) - 42) % 26 + 65)
    print(s)

if __name__ == "__main__":
    main()
```

You can test this code with the following test case:

```python
import io
import sys

def test_main():
    sys.stdin = io.StringIO("MRL")
    expected_output = "JOI"
    main()
    actual_output = sys.stdout.getvalue().strip()
    assert actual_output == expected_output

test_main()
```<|endoftext|>
