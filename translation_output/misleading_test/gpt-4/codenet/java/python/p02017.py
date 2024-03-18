Certainly! Below is the translated code from Java to Python:

```python
# Read input from user
h, w, x, y = map(int, input().split())

# Check condition and print result
if h * w % 2 == 1 and (x + y) % 2 == 1:
    print("No")
else:
    print("Yes")
```

Here's how it would work with the given test input:

Test input:
```
3 5 1 4
```

Expected output:
```
PNo
```
Note that in your expected output you have written "PNo" instead of "No." If that's not a typo and you actually need the output to start with a "P," you would adjust the Python print statement to include it:

```python
if h * w % 2 == 1 and (x + y) % 2 == 1:
    print("PNo")  # Note the 'P' in front of "No"
else:
    print("PYes")  # Presumably, this would also start with a 'P'
```
