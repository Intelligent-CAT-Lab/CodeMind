s = input()
str_result = []

i = 0
while i < len(s):
    if s[i] == '.':
        str_result.append('0')
    else:
        if s[i] == '-' and s[i + 1] == '.':
            str_result.append('1')
        else:
            str_result.append('2')
        i += 1
    i += 1

print(''.join(str_result))