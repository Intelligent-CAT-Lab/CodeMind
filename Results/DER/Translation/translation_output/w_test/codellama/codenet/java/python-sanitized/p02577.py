import sys

def is_multiple_of_9(s):
    c = 0
    for i in range(len(s)):
        c += int(s[i])
    return c % 9 == 0

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    if is_multiple_of_9(s):
        print("Yes")
    else:
        print("No")