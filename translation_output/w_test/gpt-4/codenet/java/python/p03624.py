Below is the translated Python code for the provided Java code. This Python code performs the same functionality, checking for the first non-occurring character in the input string from the alphabet.

```python
string = input()
is_NOT_found = False

count = [0] * 26
alphabet = [chr(i) for i in range(97, 123)]
for char in string:
    count[ord(char) - 97] += 1
for i in range(len(count)):
    if count[i] == 0:
        is_NOT_found = True
        break

if is_NOT_found:
    print(alphabet[i])
else:
    print("None")
```

Now you can use the provided test case to validate the result:

```python
# Test input
string = 'atcoderregularcontest'

# Expected output should be 'b' using the Python code provided
```
