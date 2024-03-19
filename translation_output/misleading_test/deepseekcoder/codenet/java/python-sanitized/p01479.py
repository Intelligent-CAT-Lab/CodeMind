def solve(s):
    s = s.replace("egg", "e").replace("chicken", "c")
    s = s.replace("ee", "e e").replace("ee", "e e")
    s = s.replace("cc", "c c").replace("cc", "c c")
    strs = s.split(" ")
    max_len = 0
    ans = ""
    for word in strs:
        if max_len < len(word):
            max_len = len(word)
            ans = word[-1]
    return ans

print(solve(input()))