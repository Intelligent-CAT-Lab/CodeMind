def codeforces_276_B(s):
    ar = [0]*26

    for ch in s:
        ar[ord(ch) - 97] += 1

    cntod = 0
    for i in range(26):
        if (ar[i] % 2) != 0:
            cntod += 1

    if cntod == 0:
        return "First"
    else:
        if cntod % 2 == 0:
            return "Second"
        else:
            return "First"

# Test
s = "ocvxailppytfwwqmfsaabdpzewzkziyhlywwwtcefmyoonfyfzwnrvttjfxxioctfnhmnrxptxtbearaqppopkokscggnenigwkpnyqkvcoldlcvybyqofnopaumykogqxhsovcfdbaiysqrmahasbcqaywvshdxlwkwvosxbrcwfewqcjqmqutebrrywxsrmuyeztlchlegzbbiojbdoycocqxgdu"
print(codeforces_276_B(s))  # Output: Second