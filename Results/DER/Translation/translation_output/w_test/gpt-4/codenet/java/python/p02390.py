Here is the equivalent Python code for the Java code you provided. You can use the following Python code to get the expected output.

```python
# Read an integer from input
S = int(input())

# Calculate hours, minutes, and seconds
h = S // 3600
hi = S % 3600
m = hi // 60
s = S % 60

# Print the result in the format h:m:s
print(f"{h}:{m}:{s}")
```

You can test this code with the input you mentioned (`46979`) and it should output `13:2:59`.
