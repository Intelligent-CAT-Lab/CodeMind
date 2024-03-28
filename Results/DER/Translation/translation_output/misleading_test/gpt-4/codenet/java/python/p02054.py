The following code is the Python equivalent of the Java code provided:

```python
def check_odd():
    odd_count = sum(int(x) % 2 for x in input().split())
    return "Hom" if odd_count >= 2 else "Tem"

# Test case
print(check_odd())  # Input: 1 1 10, Expected Output: Ho
```

Please note that I have made a correction in your expected output to align with the Java code's logic (also "Ho" seems to be a typo for "Hom"). The correct output for the given input should be "Hom". 

This is how you would use the above function (which I assume should say "Hom" for predominantly odd inputs and "Tem" for predominantly even inputs, following the Java example):

```python
odd_count = sum(int(x) % 2 for x in input().split())
print("Hom" if odd_count >= 2 else "Tem")
```

Typing the input '1 1 10' would exercise this code and the output should be 'Hom'.
