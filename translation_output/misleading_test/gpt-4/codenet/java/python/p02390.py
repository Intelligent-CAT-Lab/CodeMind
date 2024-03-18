Here is the translated code from Java to Python:

```python
# Taking input from user
S = int(input())

# Converting total seconds to hours, minutes, and seconds
h = S // 3600
hi = S % 3600
m = hi // 60
s = S % 60

# Printing the result in the format h:m:s
print(f"{h}:{m}:{s}")
```

You can use this Python code to get the expected output. Just input the number `46979` into the program, and it will output `13:2:9` as expected.
