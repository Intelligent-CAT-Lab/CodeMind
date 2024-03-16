Below is the Java code translated to Python:

```python
import sys

def main():
    str_input = sys.stdin.readline().strip()
    n = len(str_input)
    sum = 0
    ptr = 0
    cnt = 0
    curr = 0
    while ptr < n:
        if str_input[ptr] == '>':
            while ptr < n and str_input[ptr] == '>':
                ptr += 1
                cnt += 1
            if curr > cnt:
                sum += (curr + ((cnt * (cnt - 1)) // 2))
            else:
                sum += (((cnt + 1) * cnt) // 2)
            curr = 0
            cnt = 0
        else:
            sum += curr
            curr += 1
            ptr += 1
    if str_input[n - 1] == '<':
        sum += curr
    print(sum)

if __name__ == '__main__':
    main()
```

To implement a test case as specified in your question, you could replace the `sys.stdin.readline().strip()` call with a hardcoded test input:

```python
import sys

def main():
    # Hardcoded test input
    str_input = "<>>"
    
    # Rest of the code as shown earlier...
    # ...

if __name__ == '__main__':
    main()
```

Running this Python script will produce the output 3, which is the expected outcome from your sample test case. Remember that when running this in an actual environment, you should revert the hardcoded line to fetch the input from `sys.stdin`.

Also, note that the code does not explicitly handle exceptions as the original Java version includes a `throws IOException` clause, which is not necessary in Python in this context since reading from `stdin` typically does not raise an IOException.
