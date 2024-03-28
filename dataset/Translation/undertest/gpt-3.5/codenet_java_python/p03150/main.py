def check(s):
    if s == "keyence":
        return True
    else:
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                new_str = s[:i] + s[j:]
                if new_str == "keyence":
                    return True
    return False

s = input()
if check(s):
    print("YES")
else:
    print("NO")