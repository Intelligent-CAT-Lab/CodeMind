import sys

def solve():
    s = input()
    n = len(s)

    from_index = 0
    to_index = n - 1
    for i in range(n):
        if s[i] == 'A':
            from_index = i
            break

    for i in range(n - 1, -1, -1):
        if s[i] == 'Z':
            to_index = i
            break

    print(to_index - from_index + 1)

if __name__ == "__main__":
    solve()