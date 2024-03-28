Below is the translated code from Java to Python:

```python
def count_bracket_pairs(s):
    while '()' in s:
        s = s.replace('()', '')
    
    input_chars = list(s)
    
    star_index = 0
    
    for i, char in enumerate(input_chars):
        if char == '*':
            star_index = i
    
    left = star_index - 1
    right = star_index + 1
    
    result = 0
    while left >= 0:
        if input_chars[left] == '(':
            while right <= len(input_chars) - 1:
                if input_chars[right] == ')':
                    result += 1
                    break
                
                right += 1
        
        left -= 1
    
    return result

# Test input
print(count_bracket_pairs("((*)())"))
```

When you run this Python code with the test input `((*)())`, it will output `2` as expected.
