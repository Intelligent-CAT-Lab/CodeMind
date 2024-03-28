def calculate_count(s):
    count = 0
    black = 0
    i = 0
    while i < len(s):
        if s[i] == 'W':
            count += black
        else:
            black += 1
        i += 1
    return count

s = input()
result = calculate_count(s)
print(result)