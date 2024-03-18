Here is the equivalent code in Python:

```python
# Read the input
a, b, c = input().split()

# Check if the last character of the first word is the same as the
# first character of the second word, and if the last character of
# the second word is the same as the first character of the third word
if a[-1] == b[0] and b[-1] == c[0]:
    print("YES")
else:
    print("NO")
```

You can use the provided test input "rng gorilla apple" to verify the code:

```python
# Sample Test Case
test_input = "rng gorilla apple"
a, b, c = test_input.split()

if a[-1] == b[0] and b[-1] == c[0]:
    print("YES")  # Expected output: YES
else:
    print("NO")
```

Please note that in the provided Java code, the string "YES" and "NO" are in uppercase, so the Python code will output "YES" or "NO" in uppercase to match the expected output. If you wanted to be case-sensitive as per the expected output "YeA" for "YES", you'd have to modify the output strings accordingly.
