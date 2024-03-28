def calculate_substring_count(s):
    N = len(s)
    cnt = [0] * 26
    for char in s:
        cnt[ord(char) - ord('a')] += 1
    
    ans = N * (N + 1) // 2 + 1
    for i in range(26):
        if cnt[i] > 0:
            ans -= cnt[i] * (cnt[i] + 1) // 2
    
    return ans

# Test case
print(calculate_substring_count("aatt"))