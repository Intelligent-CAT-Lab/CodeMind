def determine_player(s):
    ar = [0] * 26
    
    for ch in s:
        ar[ord(ch) - 97] += 1
    
    cntod = sum(1 for count in ar if count % 2 != 0)
    
    if cntod == 0:
        return "First"
    else:
        return "Second" if cntod % 2 == 0 else "First"

# Test input
s = "ocvxailppytfwwqmfsaabdpzewzkziyhlywwwtcefmyoonfyfzwnrvttjfxxioctfnhmnrxptxtbearaqppopkokscggnenigwkpnyqkvcoldlcvybyqofnopaumykogqxhsovcfdbaiysqrmahasbcqaywvshdxlwkwvosxbrcwfewqcjqmqutebrrywxsrmuyeztlchlegzbbiojbdoycocqxgdu"
print(determine_player(s))  # Expected output: "Second"