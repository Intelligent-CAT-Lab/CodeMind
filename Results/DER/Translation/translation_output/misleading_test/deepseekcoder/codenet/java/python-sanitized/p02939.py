import sys

def solve():
    s = input()
    n = len(s)
    count = 0
    i = 0
    while i < n:
        count += 1
        if i + 1 >= n:
            break
        if s[i] == s[i + 1]:
            if i + 2 >= n:
                break
            i += 2
            count += 1
        i += 1
    print(count)

if __name__ == "__main__":
    solve()