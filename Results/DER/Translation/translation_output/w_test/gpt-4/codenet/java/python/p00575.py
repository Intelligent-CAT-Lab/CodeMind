You can translate the given Java code into Python as follows:

```python
# Read inputs from the user
a, b, c = map(int, input().split())

i = 0
cnt = 0
while cnt < c:
    i += 1
    cnt += a
    if i % 7 == 0:
        cnt += b

print(i)
```

This Python code is functionally equivalent to the provided Java code. It reads three integers as input, and then counts the number of steps it takes to reach or exceed a threshold (variable `c`) by adding value `a` each step, and value `b` on every 7th step.

To use this code with the provided test input "3 0 10", simply run the Python script and enter "3 0 10" when prompted for input. You should see the expected output "4".
