def p03200():
    s = input()
    count = 0
    black = 0
    for i in range(len(s)):
        if s[i] == 'W':
            count += black
        else:
            black += 1
    print(count)

p03200()