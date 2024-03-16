Here's the Java code translated to Python:

```python
a = int(input())
b = int(input())
k = int(input())
my_set = set()

cnt = 0
for i in range(a, b + 1):
    if cnt >= k:
        break
    cnt += 1
    my_set.add(i)

cnt = 0
for i in range(b, a - 1, -1):
    if cnt >= k:
        break
    cnt += 1
    my_set.add(i)

for ans in sorted(my_set):
    print(ans)
```

I've made a few changes to adapt the Java code to Python idioms:

1. In Python, `print` is used instead of `System.out.println`.
2. `Scanner` is not needed, Python uses `input()` for reading from the standard input.
3. The `TreeSet` is represented by a `set()` in Python, which then gets converted to a `list` and sorted to mimic the ordered behavior.
4. Python uses half-open intervals for ranges (`range(a, b+1)` means from `a` to `b` inclusive).
5. Variables do not need to be declared with types in Python.
6. The increment operation `i++` is replaced by `cnt += 1`.
7. For-loops are written differently in Python. There's no need for an explicit loop initialization, test, and increment. The `range()` function handles that.
