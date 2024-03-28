Here's the translated Python code along with a small test case:

```python
def atcoder_ABC043_B(s):
    while '0B' in s or '1B' in s:
        s = s.replace('0B', '')
        s = s.replace('1B', '')
    
    s = s.replace('B', '')
    return s

# Test case
input_str = "0000000000"
output_str = atcoder_ABC043_B(input_str)
print(output_str)
```

To test if the translation works correctly, you can run the script with the test case "0000000000", and it should produce the same output as the provided expected output:

Expected output:
```
0000000000
```
