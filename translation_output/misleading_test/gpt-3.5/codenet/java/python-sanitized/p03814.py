import sys

def solve():
    s = input().strip()
    n = len(s)

    from_char = 0
    to_char = n - 1
    for i in range(n):
        if s[i] == 'A':
            from_char = i
            break
    for i in range(n - 1, -1, -1):
        if s[i] == 'Z':
            to_char = i
            break

    print(to_char - from_char + 1)

if __name__ == "__main__":
    solve()