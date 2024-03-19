import sys

def is_valid(s):
    if len(s) % 2 == 0:
        if 'L' in s:
            return False
    else:
        if 'R' in s:
            return False
    return True

if __name__ == '__main__':
    s = sys.stdin.readline().strip()
    if is_valid(s):
        print("Yes")
    else:
        print("No")