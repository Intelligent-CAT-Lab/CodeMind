import sys
import socket

if socket.gethostname() == 'N551J':
    sys.stdin = open('a1.in')


def read_int_list():
    return list(map(int, input().split()))


def read_int():
    return int(input())


def read_str_list():
    return input().split()


def read_str():
    return input()


def solve():
    a, b, c, d, e, f = read_int_list()
    best_sugar = 0
    best_total = 100 * a
    for i in range(31):
        for j in range(31):
            water = i * 100 * a + j * 100 * b
            for k in range(3001):
                if water + k * c <= f and k * c * 100 <= water * e:
                    l1 = int((f - water - k * c) / d)
                    l2 = int((water * e // 100 - k * c) / d)
                    l = min(l1, l2)
                    if (i, j, k, l) != (0, 0, 0, 0):
                        sugar = k * c + l * d
                        total = water + sugar
                        density = sugar / total
                        best_density = best_sugar / best_total
                        if density > best_density:
                            best_sugar = sugar
                            best_total = total
    return best_total, best_sugar


def main():
    res = solve()
    print(*res)


if __name__ == '__main__':
    main()
