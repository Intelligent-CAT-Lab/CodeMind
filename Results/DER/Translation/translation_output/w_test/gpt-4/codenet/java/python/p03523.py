Below is the translated version of your Java code into Python. Just wrap your code with `input()` to make it work for a user prompt. Note that `print` is used instead of `System.out.println`, and string indexing `s[i]` is directly used instead of `s.charAt(i)` in Java.

```python
# Read input string from user
s = input()

akihabara = "AKIHABARA"
kihbr = "KIHBR"
j = 0
k = 0

for i in range(len(s)):
    if j + 1 < len(akihabara) and akihabara[j] == 'A' and akihabara[j] != s[i]:
        j += 1

    if j >= len(akihabara) or akihabara[j] != s[i]:
        print("NO")
        break

    if s[i] != 'A':
        if k < len(kihbr) and s[i] == kihbr[k]:
            k += 1
        else:
            print("NO")
            break
            
    j += 1
else:  # Note: The `else` block here is executed if the `for` loop is not broken by a `break` statement
    print("YES" if k == len(kihbr) else "NO")
```
Here's how the test case would look:

```python
s = "KIHBR"  # Test input
# ... the code from above (excluding the first line which reads the input)
```

With the test input "KIHBR", the expected output would be:

```
YES
```
