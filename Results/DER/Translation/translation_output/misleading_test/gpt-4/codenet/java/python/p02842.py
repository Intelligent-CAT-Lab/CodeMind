Below is the Python translation of your provided Java code:

```python
def calculate_consumption_tax():
    N = int(input())
    for i in range(N + 1):
        if int(i * 1.08) == N:
            return i
    return ":("

# Sample test case
N = 432
print(calculate_consumption_tax())
```
If you want the exact equivalent where the code reads from standard input, simply replace `N = 432` with `N = int(input())` and call `print(calculate_consumption_tax())` without assigning `432` to `N`.

Also, note that in Python, there's no need for a main function or importing a scanner; we can get user input directly with `input()` and parsing it to an integer with `int()`. The function `calculate_consumption_tax` encapsulates the logic for determining the output.
