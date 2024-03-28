Here's the Java code translated into Python, enclosed within triple backticks:

```python
helix = input()
complement = {
    "A": "T",
    "T": "A",
    "C": "G",
    "G": "C"
}
print(complement.get(helix, ""))
```

This Python code uses a dictionary to map the complements, reads the input string using `input()`, and prints out the corresponding complement. It also uses the `.get()` method to return an empty string as a default in case the input is not found in the dictionary keys, which is not strictly necessary given the controlled values but is a good habit for safe programming.
