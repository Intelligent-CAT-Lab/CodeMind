Here's the translated Python code with the equivalent functionality:

```python
import sys

class FScanner:
    def has_next_line(self):
        # In Python, just return True, as the input comes from stdin or a file and EOF will be handled by the reading functions
        return True

    def read_int(self):
        return int(input())

    def read_long(self):
        return int(input())

    def read_int_list(self):
        return list(map(int, input().split()))

    def read_string(self):
        return input()

    def read_string_list(self, delimiter):
        return input().split(delimiter)

def solve():
    pass

def display(data):
    if isinstance(data, list):
        for item in data:
            print(item, end=' ')
        print()

def main():
    sc = FScanner()

    n = sc.read_int()

    o = e = 0

    for i in range(1, n + 1):
        if i % 2 == 1:
            o += 1
        else:
            e += 1
    print(o * e)

# Uncomment the following line if the input is coming from a file
# sys.stdin = open('filename.txt', 'r')

if __name__ == "__main__":
    main()
```
