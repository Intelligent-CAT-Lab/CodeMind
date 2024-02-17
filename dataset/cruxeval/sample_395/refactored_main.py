s = "11"
for i in range(len(s)):
    if s[i].isdecimal():
        result = i + (s[i] == '0')
    elif s[i] == '0':
        result = -1
    else:
        result = -1
print(result)