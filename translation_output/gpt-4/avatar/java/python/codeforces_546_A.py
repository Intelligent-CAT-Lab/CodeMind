Below is the translated Python code enclosed in triple backticks:

```python
# input() reads a string with a line of input, stripping the ' ' (newline) at the end.
# This is all you need for most Codeforces problems.
o = int(input())
n = int(input())
g = int(input())

x = 0
borrow = 0

for i in range(1, g + 1):
    x += i * o

borrow = x - n

if borrow <= 0:
    print(0)
else:
    print(borrow)
```

Note that the problem statement seems to imply the input might be all on one line, which may need to be handled differently. If the inputs are on one line, the input part should look like this:

```python
o, n, g = map(int, input().split())
```

Please replace the initial three lines of the python script with the above if that's the case.
