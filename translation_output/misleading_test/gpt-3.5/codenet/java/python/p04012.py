```python
def check_palindrome(w):
    acha = ord('a')
    zcha = ord('z')
    count = 0
    for i in range(acha, zcha + 1):
        for x in w:
            if x == chr(i):
                count += 1
        if count % 2 == 1:
            return "No"
        count = 0
    return "Yes"

# Test input
test_input = "abaccaba"
print(check_palindrome(test_input))
```
```python
# Output: Yes
```
