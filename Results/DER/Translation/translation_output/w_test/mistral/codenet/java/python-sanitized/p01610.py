def run():
    line = input()
    solve(line)

def solve(line):
    is = [i//4 for i in range(24)]
    for c in line:
        if c == 'U':
            up()
        elif c == 'F':
            front()
        elif c == 'R':
            right()
        elif c == 'D':
            down()
        elif c == 'B':
            back()
        elif c == 'L':
            left()

    for j in range(len(tab)):
        for i in range(len(tab[j])):
            print(tab[j][i] == -1 and "." or "rgybwo".charAt(is[tab[j][i]])