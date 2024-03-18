Here is the translated Python code:

```python
def atcoder_ABC164_A(test_input):
    numlist = test_input.split(" ")
    Sheep = int(numlist[0])
    Wolve = int(numlist[1])

    if Wolve >= Sheep:
        return "unsafe"
    else:
        return "safe"

# Test case
test_input = "1 100"
print(atcoder_ABC164_A(test_input))
```

When you run this Python code with the provided test case, it will output `unsafe` as expected.
