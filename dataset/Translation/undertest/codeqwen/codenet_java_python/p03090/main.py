import sys

def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.append(f"{i} {j}")
                l.append(f"{i} {a - j + 1}")
                l.append(f"{a - i + 1} {j}")
                l.append(f"{a - i + 1} {a - j + 1}")
    else:
        solve(a - 1, l)
        for i in range(1, a):
            l.append(f"{a} {i}")

def main():
    a = int(input())
    l = []
    solve(a, l)
    print(len(l))
    for str in l:
        print(str)

if __name__ == "__main__":
    main()