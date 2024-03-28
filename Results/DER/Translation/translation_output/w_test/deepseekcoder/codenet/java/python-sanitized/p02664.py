def p02664():
    c = input()
    count = 0
    for i in range(len(c)):
        if c[i] == 'D' or c[i] == '?':
            count += 1
            c = c[:i] + 'D' + c[i+1:]
    print(c)

p02664()