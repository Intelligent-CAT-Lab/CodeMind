Here's the translated Python code from the provided Java code:

```python
def main():
    # Read input
    S = input()
    
    # Build the new string using slicing
    result = '2018' + S[4:]
    
    # Print the result
    print(result)

# Test case
if __name__ == "__main__":
    main()
```

You can test this code in Python by providing it with the input "2017/01/07", and it should output "2018/01/07". Note that, as per the original Java code, the year "2018" is hardcoded in the output regardless of the input provided. If this is not the intended behavior and you wish to instead replace the year from the input with "2018", please let me know, and I can adjust the code accordingly.
