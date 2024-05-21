import sys

def main():
    a = int(input())

    l = []
    solve(a, l)
    print(len(l))
    for s in l:
        print(s)

def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.append(f"{i} {j}")
                l.append(f"{i} {a + 1 - j}")
                l.append(f"{a + 1 - i} {j}")
                l.append(f"{a + 1 - i} {a + 1 - j}")
    else:
        solve(a - 1, l)
        for i in range(1, a):
            l.append(f"{a} {i}")

if __name__ == "__main__":
    main()