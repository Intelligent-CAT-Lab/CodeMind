Here is the Python equivalent of the Java code:

```python
helix = input()
switch = {
    "A": "T",
    "T": "A",
    "C": "G",
    "G": "C"
}
print(switch.get(helix, "Invalid input"))
```

In Python, we don't have a switch statement like in Java. Instead, we use a dictionary to map each case to its corresponding output. The `get` method of the dictionary is used to retrieve the value for a given key. If the key is not found in the dictionary, the second argument to `get` is returned (in this case, "Invalid input").
