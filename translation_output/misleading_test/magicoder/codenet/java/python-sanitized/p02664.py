def replace_and_count(s):
    count = 0
    result = []
    for char in s:
        if char == 'D' or char == '?':
            count += 1
            result.append('D')
        else:
            result.append(char)
    return ''.join(result), count

s = input()
s, count = replace_and_count(s)
print(s + str(count))