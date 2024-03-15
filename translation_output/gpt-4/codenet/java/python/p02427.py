Here's the equivalent Python code for the Java code you've provided:

```python
def print_binary_sequences(n):
    for i in range(2**n):
        temp = i
        print(f"{i}:", end="")
        j = 0
        while temp > 0:
            if temp % 2 == 1:
                print(f" {j}", end="")
            temp //= 2
            j += 1
        print()

n = int(input("Enter a number: "))
print_binary_sequences(n)
```

This code reads an integer from the user, then iterates from 0 to 2^n - 1, printing out each number followed by the positions of the '1' bits in its binary representation. Note that the main logic is contained within a function for modularity and that I've added a prompt in the input statement to clarify what the user is expected to enter.
