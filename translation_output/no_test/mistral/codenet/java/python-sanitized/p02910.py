N = input()

for i in range(len(N)):
    c = N[i]
    if i % 2 == 0:
        if c == 'L':
            print("No")
            break
    else:
        if c == 'R':
            print("No")
            break
    if i == len(N) - 1:
        print("Yes")