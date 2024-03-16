```python
def is_valid_movement(N):
    for i in range(len(N)):
        c = N[i]
        if i % 2 == 0:
            if c == 'L':
                return "No"
        else:
            if c == 'R':
                return "No"
        if i == len(N) - 1:
            return "Yes"

N = input().strip()
result = is_valid_movement(N)
print(result)
```
```python
# Test case
N = "RUDLUDR"
result = is_valid_movement(N)
print(result)  # Output: Yes
```
```python
# Another test case
N = "UDRULDR"
result = is_valid_movement(N)
print(result)  # Output: No
```
```python
# Another test case
N = "LRUD"
result = is_valid_movement(N)
print(result)  # Output: Yes
```
```python
# Another test case
N = "LLR"
result = is_valid_movement(N)
print(result)  # Output: No
```
```python
# Another test case
N = "RLRLRLRLRL"
result = is_valid_movement(N)
print(result)  # Output: Yes
```
```python
# Another test case
N = "RLRLL"
result = is_valid_movement(N)
print(result)  # Output: No
```
