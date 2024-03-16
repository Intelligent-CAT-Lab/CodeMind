def swap(is_, a, b, c, d):
    t = is_[d]
    is_[d] = is_[c]
    is_[c] = is_[b]
    is_[b] = is_[a]
    is_[a] = t

def up(is_):
    swap(is_, 0, 1, 2, 3)
    swap(is_, 4, 16, 12, 8)
    swap(is_, 5, 17, 13, 9)

def front(is_):
    swap(is_, 8, 9, 10, 11)
    swap(is_, 2, 15, 20, 5)
    swap(is_, 3, 12, 21, 6)

def right(is_):
    swap(is_, 12, 13, 14, 15)
    swap(is_, 2, 16, 22, 10)
    swap(is_, 1, 19, 21, 9)

def down(is_):
    swap(is_, 20, 21, 22, 23)
    swap(is_, 11, 15, 19, 7)
    swap(is_, 10, 14, 18, 6)

def back(is_):
    swap(is_, 16, 17, 18, 19)
    swap(is_, 13, 0, 7, 22)
    swap(is_, 14, 1, 4, 23)

def left(is_):
    swap(is_, 4, 5, 6, 7)
    swap(is_, 0, 8, 20, 18)
    swap(is_, 3, 11, 23, 17)

def solve(line):
    is_ = [i // 4 for i in range(24)]
    for c in line:
        if c == 'U':
            up(is_)
        elif c == 'F':
            front(is_)
        elif c == 'R':
            right(is_)
        elif c == 'D':
            down(is_)
        elif c == 'B':
            back(is_)
        elif c == 'L':
            left(is_)

    tab = [[-1, -1, 0, 1, -1, -1, -1, -1],
           [-1, -1, 3, 2, -1, -1, -1, -1],
           [4, 5, 8, 9, 12, 13, 16, 17],
           [7, 6, 11, 10, 15, 14, 19, 18],
           [-1, -1, 20, 21, -1, -1, -1, -1],
           [-1, -1, 23, 22, -1, -1, -1, -1]]

    for j in range(len(tab)):
        for i in range(len(tab[j])):
            print('.' if tab[j][i] == -1 else "rgybwo"[is_[tab[j][i]]], end="")
        print()

# Test case
line = input()  # Example input: "R"
solve(line)