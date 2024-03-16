Here is the Java code translated into Python:

```python
word = input()
uppercase = 0
lowercase = 0

for ch in word:
    if ch.isupper():
        uppercase += 1
    else:
        lowercase += 1
        
if uppercase > lowercase:
    print(word.upper())
else:
    print(word.lower())
```

This Python script will produce the same outcome as the provided Java code when provided with the test input from your example.
