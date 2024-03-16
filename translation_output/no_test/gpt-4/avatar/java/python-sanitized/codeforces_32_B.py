s = input()
str_result = ""

i = 0
while i < len(s):
    if s[i] == '.':
        str_result += '0'
    else:
        if s[i+1] == '.':
            str_result += '1'
        else:
            str_result += '2'
        i += 1
    i += 1

print(str_result)