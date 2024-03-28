```python
def codeforces_276_B(s):
    ar = [0] * 26
    
    for i in range(len(s)):
        ch = s[i]
        ar[ord(ch) - 97] += 1
    
    cntod = 0
    for i in range(26):
        if ar[i] % 2 != 0:
            cntod += 1

    if cntod == 0:
        return "First"
    else:
        if cntod % 2 == 0:
            return "Second"
        else:
            return "First"

# Test the code with the provided sample test case
test_input = "ocvxailppytfwwqmfsaabdpzewzkziyhlywwwtcefmyoonfyfzwnrvttjfxxioctfnhmnrxptxtbearaqppopkokscggnenigwkpnyqkvcoldlcvybyqofnopaumykogqxhsovcfdbaiysqrmahasbcqaywvshdxlwkwvosxbrcwfewqcjqmqutebrrywxsrmuyeztlchlegzbbiojbdoycocqxgdu"
print(codeforces_276_B(test_input))
```
