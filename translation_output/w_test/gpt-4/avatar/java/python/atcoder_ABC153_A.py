Here is the equivalent Python code for the Java code provided. It uses the built-in `input()` function to read input from the user. I have also added a simple function to encapsulate the logic:

```python
def calculate_attacks(monster_hp, serval_atk):
    ans = monster_hp // serval_atk
    mod = monster_hp % serval_atk
    if mod > 0:
        ans += 1
    return ans

# Sample test input
input_data = input()
monster_hp, serval_atk = map(int, input_data.split())

# Calculate the number of attacks and print the result
print(calculate_attacks(monster_hp, serval_atk))
```

You can run this script in your Python environment. It will read a single line of input (like "10000 1"), process it, and print the expected output, in this case, "10000".
