Here's the equivalent Python code for the provided Java sample:

```python
def attack_monster(monster_hp, serval_atk):
    ans = monster_hp // serval_atk
    if monster_hp % serval_atk > 0:
        ans += 1
    return ans

# Sample test case
input_values = input().split()
monster_hp = int(input_values[0])
serval_atk = int(input_values[1])

print(attack_monster(monster_hp, serval_atk))
```

You can use this by providing the test input directly. For example, if you use this in an IDE or a script, make sure to provide the standard input "10000 1" when prompted. If you run it as a script, it will wait for input from the standard input (usually the keyboard) before proceeding.
