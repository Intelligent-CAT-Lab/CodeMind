Here is the Python equivalent of the Java code:

```python
from collections import deque

def main():
    N = int(input())
    set_ = set()
    queue = deque(["357", "375", "537", "573", "735", "753"])
    count = 0
    ch = ['3', '5', '7']
    if N < 1000:
        for s in queue:
            if int(s) <= N:
                count += 1
        print(count)
        return
    while queue:
        s = queue.popleft()
        if int(s) <= N:
            count += 1
            for i in range(len(s) + 1):
                for j in range(len(ch)):
                    temp = add_char(s, i, ch[j])
                    if temp not in set_:
                        set_.add(temp)
                        queue.append(temp)
    print(count)

def add_char(s, location, c):
    return s[:location] + c + s[location:]

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, checks if it's less than 1000, and if so, counts the number of strings that are less than or equal to the input number. If the input number is greater than or equal to 1000, it uses a queue to generate all possible strings that can be formed by adding one of the characters '3', '5', or '7' to any position in the string "357", "375", "537", "573", "735", or "753". It then counts the number of strings that are less than or equal to the input number.
