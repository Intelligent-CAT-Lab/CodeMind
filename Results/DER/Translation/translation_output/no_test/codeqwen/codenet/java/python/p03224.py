Here is the Python equivalent of the Java code:

```python
import sys

N = int(sys.stdin.readline())
l = 1
while N > 0:
    N -= l
    l += 1

if N != 0:
    print("No")
    sys.stdout.flush()
    sys.exit()

print("Yes")
print(l)
answer = [[0] * l for _ in range(l + 1)]
Index = 1
for i in range(l + 1):
    string = str(l)
    for j in range(i):
        string += " " + str(answer[j][i - 1])
    for j in range(i, l):
        string += " " + str(answer[i][j] = Index)
        Index += 1
    print(string)
sys.stdout.flush()
sys.exit()
```

Please note that the Python code assumes that the input is provided via the standard input (stdin). If you want to read from a file, you can replace `sys.stdin.readline()` with `open('filename.txt').readline()`.
