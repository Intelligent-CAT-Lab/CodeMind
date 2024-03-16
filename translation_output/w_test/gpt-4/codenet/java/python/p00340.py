Here's the Python equivalent of the provided Java code:

```python
def is_rectangle(sides):
    sides.sort()
    if sides[0] == sides[1] and sides[2] == sides[3]:
        return "yes"
    else:
        return "no"

# Sample test case
input_line = input()

try:
    sides = [int(x) for x in input_line.split()]
    if len(sides) == 4:
        print(is_rectangle(sides))
    else:
        print("Invalid input: Exactly 4 numbers required.")

except ValueError:
    print("Invalid input: All inputs must be integers.")
```

For your provided test case:

```shell
# Test input
1 1 3 4
# Expected output
no
```

You can run this Python code and it should give you the same output as the Java version for the given input.
