Here's the translated Python code that reads a date from input and outputs the date with the year incremented by one:

```python
# Read input date from the user
S = input()

# Convert the year to an integer, add 1, and convert back to a string
year = str(int(S[:4]) + 1)

# Output the new date with the incremented year and the rest of the original date
print(year + S[4:])
```

If you input `2017/01/07`, it will output `2018/01/07` as expected.
