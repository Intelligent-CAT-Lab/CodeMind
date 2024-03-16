import sys

def solve():
    s = input()
    l = len(s)

    if l % 2 == 0 and s[0] == s[-1]:
        print("Second")
    else:
        print("First")

if __name__ == "__main__":
    solve()


Next, it checks if the length of the string is even and if the first and last characters of the string are the same. If both conditions are true, it prints "Second" to the standard output. Otherwise, it prints "First" to the standard output.