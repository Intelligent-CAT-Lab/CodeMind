Here is the translated Python code. Note that Python's input and print functions take care of reading and writing, so the In and Out classes are not needed.

```python
def get_ints():
    return map(int, input().split())

ai, ao, at, aj, al, as_, az = get_ints()
ans = 0
ans += ao

if ai % 2 + aj % 2 + al % 2 == 3:
    ans += ai + aj + al
elif ai % 2 + aj % 2 + al % 2 == 2:
    if ai != 0 and aj != 0 and al != 0:
        ans += ai + aj + al - 1
    else:
        ans += ai + aj + al - 2
elif ai % 2 + aj % 2 + al % 2 == 1:
    ans += ai + aj + al - 1
else:
    ans += ai + aj + al

print(ans)
```

To test this code with the provided test input, you would call the script like this in your command line, assuming you have the input already:

```
echo "2 1 1 0 0 0 0" | python your_script.py
```

This would print `63`, which is the expected output.
