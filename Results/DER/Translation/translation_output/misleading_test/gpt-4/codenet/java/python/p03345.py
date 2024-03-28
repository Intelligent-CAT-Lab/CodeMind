Here's the Java code translated into Python:

```python
def main():
    # Reading the input as a list of integers
    a, b, c, k = map(int, input().split())
    
    # Calculating the initial answer
    ans = a - b
    
    # Check if the answer is greater than 10^18
    if abs(ans) > 10**18:
        print("Unfair")
        return
    
    # If k is even, the answer remains the same
    # If k is odd, the answer is negated
    if k % 2 == 0:
        print(ans)
    else:
        print(ans * -1)

# Running the main function
if __name__ == "__main__":
    main()
```

You can use the following test case to check the implementation:

```python
# Sample testcase provided in the original question
# The input is "1 2 3 1" (without quotes)

# Expected output:
# -1

# To test the code, simply call the `main()` function.
main()
```

Make sure to input the test case ("1 2 3 1" in this case) after running the program. The expected output as mentioned should be `-16`.
