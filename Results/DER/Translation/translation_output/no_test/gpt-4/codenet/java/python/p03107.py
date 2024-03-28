Here is the equivalent Python code of the provided Java code:

```python
S = input()
S0_count = S.count('0')
S1_count = len(S) - S0_count

print(min(S0_count, S1_count) * 2)
``` 

The Python code uses the `input()` function to read from standard input. The `count()` method is used to count the number of `'0'` characters in the string. The `min()` function is then used to calculate the minimum of the two counts, which is then multiplied by 2 to produce the final result, which is printed to the console.
