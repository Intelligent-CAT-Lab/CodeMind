def check_string(s):
    s = sorted(s)
    if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
        return "Yes"
    else:
        return "No"

s = input()
print(check_string(s))