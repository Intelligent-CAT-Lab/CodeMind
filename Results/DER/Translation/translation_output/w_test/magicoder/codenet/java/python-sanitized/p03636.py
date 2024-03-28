import sys

def abbreviate(s):
    leng = len(s)
    return s[0] + str(leng-2) + s[-1]

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(abbreviate(s))