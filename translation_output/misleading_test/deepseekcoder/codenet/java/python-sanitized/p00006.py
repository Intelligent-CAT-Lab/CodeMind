import sys

def reverse_string(s):
    return s[::-1]

if __name__ == "__main__":
    str = sys.stdin.readline().strip()
    print(reverse_string(str))