Here is the Python version of the given Java code:

```python
helix = input()
complements = {'A': 'T', 'T': 'A', 'C': 'G', 'G': 'C'}
print(complements.get(helix, ""))
```

The above Python code reads from standard input, just like the Java code. It uses a dictionary to map each character in the helix to their complement. The `print` statement outputs the complement, and the `get` method ensures that if the input is not in the dictionary, an empty string is returned (which is equivalent to having no `default` in the Java `switch` statement).
