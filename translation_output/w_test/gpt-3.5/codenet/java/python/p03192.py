```python
def count_occurrences_of_2(input_string):
    count = 0
    for char in input_string:
        if char == '2':
            count += 1
    return count

input_string = input()
print(count_occurrences_of_2(input_string))
```

Test with the provided sample input:
```python
assert count_occurrences_of_2("1222") == 3
```
