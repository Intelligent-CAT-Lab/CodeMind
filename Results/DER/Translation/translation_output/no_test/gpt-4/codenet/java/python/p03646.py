Here is the equivalent Python code:
```python
def solve():
    K = next_long()
    N = 50
    lst = [K // N + i for i in range(N)]
    
    for i in range(K % N):
        lst[i % N] += N + 1
        lst = [x - 1 for x in lst]
    
    print(N)
    output = list(map(str, lst))
    print(' '.join(output))

def next_long():
    return int(input())

def main():
    solve()

if __name__ == "__main__":
    main()
```

This code considers that input will be given directly and read line by line as per `next_long` function calls. Please note that the input handling and output is usually different in Python compared to Java, and Python does not require explicit flushing of stdout, as it is typically auto-flushed when the script finishes or a newline character is written.
