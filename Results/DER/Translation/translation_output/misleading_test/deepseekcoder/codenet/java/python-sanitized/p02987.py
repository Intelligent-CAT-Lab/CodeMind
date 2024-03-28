def p02987(s):
    s = sorted(s)
    if s[0]==s[1] and s[2]==s[3] and s[1]!=s[2]:
        return "Yes"
    else:
        return "No"

print(p02987(input()))