def main():
    s = input()
    x, y, k = 0, 0, 0
    co = [[0] * 101 for _ in range(2)]
    co[0][k] = x
    co[1][k] = y
    k += 1

    for ch in s:
        if ch == 'L':
            x -= 1
        elif ch == 'R':
            x += 1
        elif ch == 'U':
            y += 1
        elif ch == 'D':
            y -= 1
        co[0][k] = x
        co[1][k] = y
        k += 1

    flag = True
    for i in range(k - 3):
        for j in range(i + 3, k):
            dx = abs(co[0][i] - co[0][j])
            dy = abs(co[1][i] - co[1][j])
            if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
                flag = False
                break
        if not flag:
            break

    if flag:
        print("OK")
    else:
        print("BUG")


if __name__ == "__main__":
    main()