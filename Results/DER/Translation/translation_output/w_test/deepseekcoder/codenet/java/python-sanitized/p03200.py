def p03200():
    count = 0
    s = input()
    black = 0
    for i in range(len(s)):
        if s[i] == 'W':
            count += black
        else:
            black += 1
    print(count)

p03200()