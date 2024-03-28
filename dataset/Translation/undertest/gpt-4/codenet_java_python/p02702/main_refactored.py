class main:
    # Test input
    s = "1817181712114"
    
    # Expected output: 3
    
    # Your code here!
    p = 2019
    
    # ans: the number of patterns where substring of s[i:j] (i<j) is a multiple of 2019.
    # ex. 1817181712114
    #         ^^^^^
    ans = 0
    
    # Prefixed sum array for calculating "the remainder of 2019" for each i
    d = [0] * (len(s) + 1)
    ten = 1
    
    # Calculate d array (from the right)
    for i in range(len(s) - 1, -1, -1):
        a = (int(s[i]) * ten) % p
        d[i] = (d[i + 1] + a) % p
        ten = (ten * 10) % p
    
    # Count frequencies of same d[i] values
    freq_map = {}
    for i in range(len(s) + 1):
        key = d[i]
        freq_map[key] = freq_map.get(key, 0) + 1
    
    # Calculate the number of pairs (nC2 patterns for n same values)
    for val in freq_map.values():
        ans += val * (val - 1) // 2
    
    print(ans)