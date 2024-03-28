def check(s):
    if s == "keyence":
        return True
    else:
        for i in range(len(s)):
            for j in range(i + 1, len(s) + 1):
                str_ = s[:i] + s[j:]
                if str_ == "keyence":
                    return True
    return False

# Test case input
s = input()  # Enter "keyofscience" during execution to match the example
if check(s):
    print("YES")
else:
    print("NO")