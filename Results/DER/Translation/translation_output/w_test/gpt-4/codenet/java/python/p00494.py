Here is the Python version of the given Java code:

```python
def main():
    str_with_padding = "$" + input() + "$"
    ans = 0
    s = 0
    for i in range(1, len(str_with_padding)):
        if str_with_padding[i] == 'O' and str_with_padding[i - 1] != 'O':
            s = i
        if str_with_padding[i] == 'O' and str_with_padding[i + 1] != 'O':
            l = i - s + 1
            if s >= l and len(str_with_padding) - i - 1 >= l:
                ok = True
                for j in range(l):
                    if str_with_padding[s - 1 - j] != 'J' or str_with_padding[i + 1 + j] != 'I':
                        ok = False
                        break
                if ok:
                    ans = max(ans, l)
    print(ans)

# Running the main function when this script is executed
if __name__ == "__main__":
    main()
```

Now, using the test input 'OJJOOIIOJOI', this code will produce the expected output '2' when executed.
