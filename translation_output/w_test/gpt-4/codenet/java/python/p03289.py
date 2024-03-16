Here is the equivalent Python code based on the given Java code:

```python
# Get input from the user
S = input()

# Check if the first character is 'A'
if S[0] != 'A':
    print("WA")
else:
    # Count occurrences of 'C' within the specified range
    count = sum(1 for i in range(2, len(S) - 1) if S[i] == 'C')
    index = S.find('C', 2, len(S) - 1)

    # Ensure there is exactly one 'C' and it is within the range
    if count != 1:
        print("WA")
    else:
        # Check if other characters are lowercase, besides the first 'A' and the 'C' at the index
        if all(S[i].islower() or i == index for i in range(1, len(S))):
            print("AC")
        else:
            print("WA")
```

Now, if we test the above code with the input 'AtCoder', it should output 'AC', as expected.

How it works:
- The input string is read directly (no need to import the `Scanner` class as in Java).
- We iterate through the string to count the number of 'C' characters within the specified range (from the third character to the second-to-last). We use a generator expression to count occurrences where the condition is met.
- Python's `str.find()` method is used to find the index of 'C' if present within the specified range (this assumes that finding the index would only make sense if there's exactly one 'C' as counted before, which is checked).
- We use list comprehensions and string method `islower()` to ensure the rest of the characters are lowercase.
- Lastly, we print the result according to the given rules.
