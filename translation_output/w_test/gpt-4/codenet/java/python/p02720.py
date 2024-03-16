Here's the translated Python code. Note that in Python, we generally don't need a custom class for faster I/O, as the built-in functions are usually sufficient for most purposes.

```python
from collections import deque

def find_kth_number(k):
    queue = deque(range(1, 10))
    val = -1

    while k > 0:
        val = queue.popleft()
        last_digit = val % 10

        if last_digit != 0:
            queue.append(val * 10 + last_digit - 1)
        queue.append(val * 10 + last_digit)
        if last_digit != 9:
            queue.append(val * 10 + last_digit + 1)

        k -= 1

    return val

if __name__ == '__main__':
    k = int(input())
    print(find_kth_number(k))
```

To use this code, simply run the Python script, and when prompted, input the value for `k`. The script will output the expected result. 

Test case:
```
15
```
Expected output:
```
23
```
