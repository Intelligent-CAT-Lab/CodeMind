```python
try:
    str_input = input().split()
    A = int(str_input[0])
    P = int(str_input[1])
    print((P + 3 * A) // 2)

except Exception as e:
    print("Exception :", e)
```
